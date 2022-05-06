package kr.co.infopub.chapter.s030;

import java.text.MessageFormat;

public class BioCalendar {
    // 상수 값은 변할 수 없다
    public static final int PHYSICAL = 23; // const

    // 멤버 메소드 선언
    public double getPhysical(int index, int days, int max) {
        double ret = 0.0f;
        ret = (max * Math.sin((days % index) * 2 * Math.PI / index));
        return ret;
    }

    public static void main(String[] args) {
        int index = PHYSICAL; // 상수 값을 변수에 대입한다
        int days = 1200;
        BioCalendar bio = new BioCalendar();
        double physical = bio.getPhysical(index, days, 100);
        System.out.println(physical);
    }
}
