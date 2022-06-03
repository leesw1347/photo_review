package Chapter3.Part3.Sub5;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class MyLinkedList<T> implements List<T> {

    private int size; // 요소의 개수를 추적한다
    private Node head; // 첫 번째 노드에 대한 참조입니다.

    private class Node {
        public T data;
        public Node next;

        // Node 클래스의 생성자 함수1
        public Node(T data) {
            this.data = data;
            this.next = null;
        }

        // Node 클래스의 생성자 함수2
        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }

        @Override
        public String toString() {
//            return super.toString();
            return "Node(" + data.toString() + ")";
        }
    }

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        List<Integer> mll = new MyLinkedList<>();
        mll.add(1);
        mll.add(2);
        mll.add(3);
        System.out.println(mll.contains(3));
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return indexOf(o) != -1;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        List.super.forEach(action);
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public <T1> T1[] toArray(IntFunction<T1[]> generator) {
        return List.super.toArray(generator);
    }

    @Override
    public boolean add(T t) {
        System.out.println(t);
//        return false;
        if (head == null) {
            head = new Node(t);
            return false;
        } else {
            Node node = head;
            // 마지막 노드까지 반복한다
            for (; node.next != null; node = node.next) {
            }
            node.next = new Node(t);
        }
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeIf(Predicate<? super T> filter) {
        return List.super.removeIf(filter);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void replaceAll(UnaryOperator<T> operator) {
        List.super.replaceAll(operator);
    }

    @Override
    public void sort(Comparator<? super T> c) {
        List.super.sort(c);
    }

    @Override
    public void clear() {

    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public void add(int index, T element) {

    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        int index = 0;
        boolean is_contains = false;

        if (o == null) {
            return -1;
        }
        Node node = head;
//        System.out.println(node);
//        System.out.println(node.next);
//        System.out.println(node.data);
//        System.out.println("----");

        for (; !is_contains; node = node.next) {
//            System.out.println("DEBUG1 " + o);
//            System.out.println("DEBUG2 " + node.data);
            if (node != null) {
                if (o == node.data) {
                    is_contains = true;
                    break;
                } else {
                    index += 1;
                }
            }
        }
        if (!is_contains) {
            index = -1;
        }
        System.out.println("리턴하고자 하는 인덱스는 " + index);
        return index;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public Spliterator<T> spliterator() {
        return List.super.spliterator();
    }

    @Override
    public Stream<T> stream() {
        return List.super.stream();
    }

    @Override
    public Stream<T> parallelStream() {
        return List.super.parallelStream();
    }

}
