package kr.co.infopub.chapter.s028;

import java.text.MessageFormat;

public class BioCalendar {
    // 상수 값은 변할 수 없다

    public static final int PHYSICAL = 23; // const

    public static void main(String[] args) {
        int index = PHYSICAL; // 상수 값을 변수에 대입한다
        int days = 1200;
        double physical = 100 * Math.sin((days % index) * 2 * Math.PI / index);
        String msg = MessageFormat.format("나의 신체 지수는 {0}입니다", physical);
        System.out.println(msg);
    }
}
