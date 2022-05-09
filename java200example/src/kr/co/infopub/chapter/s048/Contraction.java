package kr.co.infopub.chapter.s048;

public class Contraction {
    public static int sumEach(int n) {
        int tot = 0;
        while (n != 0) {
            System.out.println(n % 10);
            tot += n % 10; // 3->2->1
            n /= 10; // 123->12->1->0
        }
        return tot;
    }

    public static void main(String[] args) {
        int number = 1234567;
        int value = sumEach(number);
        System.out.printf("%d에 대한 각 자리의 숫자 합 : %d\n", number, value);
    }
}