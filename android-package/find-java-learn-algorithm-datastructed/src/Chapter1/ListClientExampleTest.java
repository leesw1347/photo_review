package Chapter1;

import org.junit.jupiter.api.Test;

import java.util.List;


/**
 * ListClientExample 클래스에 대한 JUnit 코드
 */
public class ListClientExampleTest {
    /**
     * TestMethod
     */
    @Test
    public void testListClientExample() {
        ListClientExample listClientExample = new ListClientExample();
        List list = listClientExample.getList();
    }
}
