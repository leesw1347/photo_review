package kr.co.infopub.chapter.s071;

import java.io.PrintStream;
import java.text.MessageFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.Properties;

public class SystemTest {
    public static void main(String[] args) {

        // 1970.1.1부터 현재까지 걸린 시간을 밀리세컨드 단위로 반환한다
        long ltime = System.currentTimeMillis();
        System.out.println(ltime);
        for (int i = 0; i < 100000; i++) {
            System.out.print("");
        }
        long ltime2 = System.currentTimeMillis(); // milli 1/1000초
        System.out.println((ltime2 - ltime));
        System.out.println((MessageFormat.format("{0}년", ltime2 / 1000 / 60 / 60 / 245 / 365)));

        Properties properties = System.getProperties(); // 시스템의 환경변수정보를 확인한다

        // 원하는 System property
        System.out.println(properties.getProperty("java.vm.version")); // 17.0.2
        System.out.println(properties.getProperty("file.separator")); // \

        System.out.println(new Date(System.currentTimeMillis())); // 오늘 날짜 출력
        // java.util.*에서
        // 모든 System Property
        Enumeration<Object> enumeration = properties.keys();
        int i = 0;
        while (enumeration.hasMoreElements()) {
            String keys = (String) enumeration.nextElement();
            System.out.println((++i + " ") + keys + " : " + properties.getProperty(keys));
        }
        // main
    }
}