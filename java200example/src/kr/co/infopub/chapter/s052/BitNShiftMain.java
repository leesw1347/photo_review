package kr.co.infopub.chapter.s052;

import java.text.MessageFormat;

public class BitNShiftMain {
    public static int BITMASK = 1;

    // 10진법수를 2진수 스트링으로 변환
    public static String shifts(int a) {
        int BITMASK = 1;
        StringBuilder s = new StringBuilder();
        for (int i = 0; i <= 31; i++) {
//            s.append((a & BITMASK));
            s.insert(0, (a & BITMASK));
            a >>= 1;
        }
//        return s.toString();
//        StringBuilder str = new StringBuilder();
//        str = MessageFormat.format("{0}", s.toString()).toString();
        System.out.println("최종 s의 값은 :" + s.toString());
        return s.substring(s.indexOf("1"));
    }

    public static void main(String[] args) {
        int num1 = 123;
        int num2 = -123;
        System.out.printf("%d : %s\n", num1, shifts(num1));
        System.out.printf("%d : %s\n", num2, shifts(num2));
    }
}