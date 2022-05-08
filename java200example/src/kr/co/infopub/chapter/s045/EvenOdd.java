package kr.co.infopub.chapter.s045;

public class EvenOdd {
    public static void showOddnEvent(int n) {
        int temp = n;
        for (; temp != 1; ) {
            if (temp % 2 == 1) { // 홀수
                temp = temp * 3 + 1;
            } else { // 짝수
                temp /= 2;
            }
            System.out.println("[" + temp + "] ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        showOddnEvent(122);
    }
}
