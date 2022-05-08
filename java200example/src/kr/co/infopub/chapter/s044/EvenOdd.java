package kr.co.infopub.chapter.s044;

public class EvenOdd {
    public static void showOddnEven(int n) {
        int temp = n; // n값 복사
        int count = 0;

        do {
            if (temp % 2 == 1) {
                temp = temp % 3 + 1; // 홀수
            } else {
                temp /= 2; // 짝수
            }
            if (count % 3 == 0) {
                System.out.println();
            }
            System.out.print("[" + temp + "] ");
            count++;
        } while (temp != 1);
        System.out.println("\n----");
    }

    public static void main(String[] args) {
        showOddnEven(122);
    }
}
