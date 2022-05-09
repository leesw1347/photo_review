package kr.co.infopub.chapter.s053;

public class ForCondition {
    public static void main(String[] args) {
        int s = 0;
        for (int i = 1; i <= 100; i++) {
            s += i;
        }
        System.out.println("1~100의 합 : " + s);
        s = 0; // 0으로 초기화
        int d = 0; // 짝수의 합만 구한다

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) { // 홀수의 합만 구한다
                s += i;
            } else if (i % 2 == 0) { // 짝수의 합만 구한다
                d += i;
            }
        }
        System.out.println("홀수의 합 : " + String.valueOf(s));
        System.out.println("짝수의 합 : " + String.valueOf(s));
    }
}
