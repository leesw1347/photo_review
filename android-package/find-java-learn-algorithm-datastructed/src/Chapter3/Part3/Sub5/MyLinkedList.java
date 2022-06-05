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

        System.out.println(Arrays.toString(mll.toArray()) + " size = " + mll.size());
        mll.remove(new Integer(2));
        System.out.println(Arrays.toString(mll.toArray()) + " size = " + mll.size());

        mll.iterator();
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

    /**
     * @return Iterator 객체
     * @summary 반복문을 돌리기 위해서 Iterator 객체를 리턴하는 함수
     */
    @Override
    public Iterator<T> iterator() {
        T[] array = (T[]) toArray();
        return Arrays.stream(array).iterator();
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
        System.out.println("add 함수 실행: " + t);
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
        boolean flag = true;
        Iterator iterator = c.stream().iterator();
        while (iterator.hasNext()) {
            T value = (T) iterator.next();
            if (!contains(value)) { // -1이 나오면 c 안에 1개라도 포함되지 않는 원소가 있다는 것을 의미한다
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
//        return false;
        // Collection으로 들어온 모든 원소들을 Node에 추가한다
        boolean flag = true;

        Iterator iterator = c.iterator();
        while (iterator.hasNext()) {
            T o = (T) iterator.next();
            flag &= add(o); //
        }
        return flag;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        throw new UnsupportedOperationException();
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
        head = null;
        size = 0;
    }

    /**
     * @param index
     * @return
     * @summary index에 존재하는 node 데이터를 가져온다
     */
    @Override
    public T get(int index) {
        Node node = getNode(index);
        if (node != null) {
            return node.data;
        }
        try {
            return node.data;
        } catch (NullPointerException ex) {
            return null;
        }
    }


    /**
     * @param index
     * @return
     * @summary Returns the node at the given index.
     */
    private Node getNode(int index) {
        if (index < 0 || index >= size) { // 반복문을 돌릴 index 의 크기가 0보다 작거나 size랑 같거나 클경우 IndexOutOfBoundsException를 처리한다
            throw new IndexOutOfBoundsException();
        }
        Node node = head;

        // 노드를 index 위치까지 이동 시킨다
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    /**
     * @param index   index 위치에 element를 추가한다
     * @param element 추가할 element data
     */
    @Override
    public void add(int index, T element) {
        if (index == 0) {
            head = new Node(element, null);
        } else {
            Node node = getNode(index - 1);
            node.next = new Node(element, node.next); // 이전 노드의 .next를 새롭게 생성한 노드로 설정하고, 다음 노드는 기존에 있던 node.next로 설정해준다
        }
    }

    /**
     * @param index 삭제할 index를 getNode를 통해서 찾은 뒤 null이 아닐 경우 삭제하고 노드 연결을 수정해준다
     * @return
     * @summary node list 에서 index에 해당하는 위치의 값을 찾는데 사용한다
     */
    @Override
    public T remove(int index) {
        T element = get(index); // index에 해당하는 node의 data 값을 확보한다
        if (index == 0) {
            head = head.next;
        } else {
            Node node = getNode(index - 1);
            node.next = node.next.next; // 삭제하려는 노드의 next를 이전 노드와 연결해준다
        }
        size--; // 노드를 1개 제거하기 때문에 size도 줄여준다
        return element;
    }

    /**
     * @param target 찾아서 반환하려는 data 값
     * @return node list 내 index 위치
     * @summary node 내 target에 대한 데이터가 존재하면 list에서 해당하는 index 값을 리턴해준다
     */
    @Override
    public int indexOf(Object target) {
        Node node = head;

        for (int i = 0; i < size; i++) {
            if (equals(target, node.data)) {
                return i;
            }
            node = node.next;
        }
        return -1;
    }

    /**
     * @param o
     * @return
     * @summary node list에서 o에 해당하는 값의 마지막 index 값을 구한다
     */
    @Override
    public int lastIndexOf(Object o) {
        Node node = head;
        int index = -1;
        for (int i = 0; i < size; i++) { // stream 객체를 이용해서 while(*hasNext)를 사용할 수 있다
            if (equals(o, node.data)) {
                index = i;
            }
            node = node.next;
        }
        return index;
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

    private boolean equals(Object target, T data) {
        return (target == data);
    }
}
