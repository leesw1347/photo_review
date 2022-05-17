package kr.co.infopub.chapter.s080;

import java.util.ArrayList;

public class EasyBoxingMain {
    public static void main(String[] args) {
        int intNm1 = 123;
        long longNum1 = 345L;
        double doubleNum = 123.123;

        Integer intWrap1 = intNm1; // new Integer(intNm1); Boxing
        Long longWrap1 = longNum1; // new Long(longNum1); Boxing
        Double doubleWrap1 = doubleNum; // Boxing
        double dd = doubleWrap1; // unBoxing

        // 기본 타입 <-> Wrapper는 캐스팅 없이 사용
        Integer intWrap2 = intNm1; // Boxing
        intNm1 = intWrap2; // UnBoxing
        System.out.println(intNm1);

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(new Integer(3));
        integerArrayList.add(5);
        int a = integerArrayList.get(0); // <Integer>
        System.out.println("ArrayList에서 끄집어낸 값이 " + a);

    }
}
