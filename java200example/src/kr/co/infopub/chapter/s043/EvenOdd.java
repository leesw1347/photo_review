package kr.co.infopub.chapter.s043;

public class EvenOdd {
    public static void showOddnEvenw(int n) {
        int temp = n;
        while (temp != 1) {
            if (temp % 2 == 1) { // 홀수
                temp = temp * 3 + 1;
            } else {
                temp /= 2;
            }
            System.out.print("[" + temp + "] ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        showOddnEvenw(121);
    }
}