package kr.co.infopub.chapter.s050;

public class BitNShiftMain {
    // 10진 정수를 2진 문자열로 변환
    public static String shifts(int a) {
        StringBuilder s = new StringBuilder();
        int count = 8;
        for (int i = 0; i <= 31; i++) {
            int aa = a % 2; // 0,1 (2진수)를 모듈러 연산을 통해서 가져온다
            if (i % count == 0) {
                s.append(" ");
            }
            s = new StringBuilder((aa >= 0) ? aa + s.toString() : (-aa) + s.toString());
            a >>= 1; // a /= 2;
        }
        return s.toString();
    }

    public static void main(String[] args) {
        int intNums1 = 1;
        int intNums2 = -123;
        System.out.printf("%d : %s\n", intNums1, shifts(intNums1));
        System.out.printf("%d : %s\n", intNums2, shifts(intNums2));
    }
}