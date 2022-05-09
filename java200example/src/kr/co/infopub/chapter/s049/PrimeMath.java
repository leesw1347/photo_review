package kr.co.infopub.chapter.s049;

public class PrimeMath {
    public static boolean isPrime(int n) {
        boolean isS = true;
//        Math.sqrt(n);
        System.out.println(Math.sqrt(n)); // 제곱근을 구한다
        for (int i = 2; i < (int) Math.sqrt(n); i++) {
            System.out.println(n + "," + i + ":" + n % i);
            if (n % i == 0) {
                isS = false;
                break;
            }
        }
        return isS;
    }

    public static void main(String[] args) {
        int number = 1234567;
        boolean ifPrime = isPrime(number); // 소수인가를 확인한다
//        System.out.println(number + ", " + ifPrime);s
        if (ifPrime) {
            System.out.printf("%는 1과 자신으로만 나눠 떨어지는 소수다.", number);
        } else {
            System.out.printf("%d는 소수가 아니다 ", number);
        }
    }
}
