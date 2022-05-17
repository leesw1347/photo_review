package kr.co.infopub.chapter.s074;

import java.text.MessageFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class CalendarTest {
    private final static Integer POS = 100;


    public static void main(String[] args) {
        long millis = System.currentTimeMillis(); // 1970.1.1부터 경과 시가s msec
        String relayDate = MessageFormat.format("{0}일이 경과했습니다", (millis / POS / 24 / 60 / 60));
        System.out.println(relayDate.toString()); // 며칠경과했는지 표현한다

        Date d = new Date(); // 오늘 날짜를 리턴한다
        System.out.println(MessageFormat.format("오늘날짜는 {0}", d));
        Date dd = new Date(d.getTime() + 24 * 60 * 60 * 1000); // 하루 후
        System.out.println(MessageFormat.format("하루가 경과한 뒤의 날짜는 {0}", dd));

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d);
//        Calendar
    }
}