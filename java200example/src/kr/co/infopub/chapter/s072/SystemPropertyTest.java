package kr.co.infopub.chapter.s072;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class SystemPropertyTest {
    // System.getProperty()는 시스템 변수를, System.getenv()는 자바 환경변수를 반환한다
    public static void main(String[] args) {
        long nanotime = System.nanoTime();
        long nanotime2 = System.nanoTime();
        System.out.print(nanotime2 - nanotime);

        System.out.println(System.getenv("JAVA_HOME")); // JAVA_HOME 환경변수 확인
        // 모든 env 구하기
        // 시스템 변수를 (key, value)로 저장한 맵을 반환한다
        Map<String, String> map = System.getenv(); // 환경변수
        Set<String> keySet = map.keySet();

        /**
         * System.getProperties()는 Properties
         * System.getenv()는 Map을 반환한다
         * Enumeration은 Iterator의 오래된 버전입니다 (Key를 얻어서 Value를 얻을 수 있다)
         */

        Iterator<String> iter = keySet.iterator();
        int j = 0;
        while (iter.hasNext()) {
            String keys = iter.next();
            System.out.println((++j) + " " + keys + " : " + map.get(keys));
        }
    }
}