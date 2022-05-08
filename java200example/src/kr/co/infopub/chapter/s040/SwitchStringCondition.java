package kr.co.infopub.chapter.s040;

public class SwitchStringCondition {
    public static double toMoney(String c) {
        double tot = 0.0f;
        switch (c) {
            case "USD" -> tot = 1126.5;
            case "JPY" -> tot = 110.6;
            case "CNY" -> tot = 10;
            default -> tot = 1;
        }
        return tot;
    }

    public static void main(String[] args) {
        String money = "USD";
        double result = toMoney(money);
        System.out.printf("%s => %.2f\n", money, result);
    }
}
