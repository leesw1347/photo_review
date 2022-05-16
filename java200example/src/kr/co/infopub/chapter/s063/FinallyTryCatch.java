package kr.co.infopub.chapter.s063;

public class FinallyTryCatch {
    public static void main(String[] args) {
        try {
            //수학 연산에서 발생하는 예외를 처리한다
            // Divide by zero
            int x = 5;
            int y = 20 / (5 - x); // 여기에서 예외를 던진다
            System.out.println(y);
        } catch (ArithmeticException ex) { // run time error
            System.out.println("==> 0으로 나눴나 확인해본다");
            ex.printStackTrace();
        } finally {
            System.out.println("난 수행되어야만 해");
        }
    }
}