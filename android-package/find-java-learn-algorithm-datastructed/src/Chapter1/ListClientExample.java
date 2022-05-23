package Chapter1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @apiNote 인터페이스 기반 프로그래밍 (interface-based programming)
 * 자바 interface가 아닌 일반적인 개념의 인터페이스를 의미한다
 */
public class ListClientExample {
    @SuppressWarnings("rawtypes")
    private List list;

    public ListClientExample() {
        /**
         * 코드는 오로지 List와 같은 인터페이스만 의존하고, ArrayList 클래스와 같은 특정 구현에 의존해서는 안된다.
         */
        list = new LinkedList();
    }

    public List getList() {
        return list;
    }

    public static void main(String[] args) {
        ListClientExample listClientExample = new ListClientExample();
        List list = listClientExample.getList();

        System.out.println(list);
    }
}
