package kr.co.infopub.chapter.s069;

import java.text.MessageFormat;

public class StringBufferMain {
    public static void main(String[] args) {
        // StringBuffer 생성
        StringBuffer sb1 = new StringBuffer();

        // 바꾼 문자열을 대입해서 넣지 않으면 반영되지 않는걸 immutable이라고 한다
        // 1) 계속 붙이는 함수 mutable
        // append는 String의 String (+, concat)과 같은 역할을 한다
        sb1.append("안녕하세요. ")
                .append("또 만나요.")
                .append("모두를 사랑해요 기다려봐. ");
        print(sb1);

        // 2) REPLACE
        sb1.replace(0, 2, "나보기가 역겨워"); // sb1[0:2]를 지우고, 나보기가 역겨워 문자열 start(0)에 insert
        print(sb1);

        // 3) REVERSE (문자열 뒤집기)
        sb1.reverse();
        print(sb1);

        // 4) DELETE
        sb1.delete(10, 15); // delete sb1[10:15]
        print(sb1);

        // 5) CAL BY REFERENCE, SHALLOW COPY
        replaces(sb1);
        print(sb1);
    }

    private static void replaces(StringBuffer sb) {
        sb.reverse();
        sb.replace(0, 3, "GoGo");
    }

    private static void print(StringBuffer sb1) {
        System.out.print(MessageFormat.format("{0} {1}", sb1.toString(), sb1.hashCode()));
        System.out.println();
    }
}
