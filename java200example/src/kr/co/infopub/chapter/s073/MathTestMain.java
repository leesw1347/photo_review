package kr.co.infopub.chapter.s073;

public class MathTestMain {
    public static void main(String[] args) {
        // constant
        System.out.println("Math.E " + Math.E);
        System.out.println("Math.PI " + Math.PI);
        // method
        System.out.println("Math.abs(-5) 절대값: " + Math.abs(-5)); // -가 signed면 unsigned로 unsigned면 signed로 변환
        System.out.println("Math.ceil(4.34) 올림: " + Math.ceil(4.34));
        System.out.println("Math.round(4.34) 반올림: " + Math.round(4.5));
        System.out.println("Math.floor(4.34) 버림: " + Math.floor(4.34));

    }
}
