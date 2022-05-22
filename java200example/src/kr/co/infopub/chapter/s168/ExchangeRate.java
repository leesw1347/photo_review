package kr.co.infopub.chapter.s168;

public class ExchangeRate {
    public static void main(String[] args) {
        // 환율 정보를 객체에 저장
        FixerRate fixerRate = new FixerRate();
        fixerRate.base = "USD";
        fixerRate.date = "2017-06-08";
        System.out.println(fixerRate);

        // 환율 정보를 이용하여 계산하기
        double krw = 1000000;
        double ratio = fixerRate.krw;
        double result = ExchangeRate.calculate(krw, ratio);
    }

    // 나누는 행위를 반복 -> 메소드를 만든다
    private static double calculate(double krw, double ratio) {
        return (Double) krw / ratio;
    }
}
