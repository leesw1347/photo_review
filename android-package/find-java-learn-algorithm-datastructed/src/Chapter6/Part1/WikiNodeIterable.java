package Chapter6.Part1;

import org.jsoup.nodes.Node;

import java.util.*;
import java.util.function.Consumer;

/**
 * Performs a depth-first traversal of a jsoup Node;
 */
public class WikiNodeIterable implements Iterable<Node> {

    private Node root;

    /**
     * Creates an iterable starting with the given Node;
     */
    public WikiNodeIterable(Node node) {
        this.root = node;
    }

    @Override
    public Iterator<Node> iterator() {
        return new WikinodeIterator(root);
    }

    /**
     * Inner class that implements the Iterator
     */
    private class WikinodeIterator implements Iterator<Node> {

        // this stack keeps track of the Nodes waiting to be visited
        Deque<Node> stack;

        /**
         * Initializes the Iterator with the root Node on the stack
         *
         * @param node
         */
        public WikinodeIterator(Node node) {
            stack = new ArrayDeque<Node>();
            stack.push(node);
        }

        @Override
        public boolean hasNext() {
            return !stack.isEmpty(); // 스택이 비어있지 않다면 true를 리턴한다
        }

        @Override
        public Node next() {
            // 노드를 뽑아서 리턴한다
            // if the stack is empty, we're done
            if (stack.isEmpty()) {
                throw new NoSuchElementException("WikiNodeIterator에 현재 Stack Node가 비어있습니다");
            }

            // otherwise pop the next Node off the stack
            Node node = stack.pop();
//            System.out.println(node);

            // push the children onto the stack in reverse order
            List<Node> nodes = new ArrayList<Node>(node.childNodes());
            for (Node child : nodes) {
                stack.push(child);
            }
            return node;
        }

        @Override
        public void remove() {
//            Iterator.super.remove();
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public void forEach(Consumer<? super Node> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<Node> spliterator() {
        return Iterable.super.spliterator();
    }
}
