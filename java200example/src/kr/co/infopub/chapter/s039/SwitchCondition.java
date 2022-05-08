package kr.co.infopub.chapter.s039;

public class SwitchCondition {
    // switch를 이용하여 입력된 문자에 대한 카드값을 구해 보자
    public static int toNum(char c) {
        int tot = 0;
        switch (c) {
            case 'A' -> tot = 1;
            case 'T' -> tot = 10;
            case 'J' -> tot = 11;
            case 'Q' -> tot = 12;
            case 'K' -> tot = 13;
            default -> tot = c - '0';
        }
        return tot;
    }

    public static void main(String[] args) {
        char c = 'Y';
        int result = toNum(c);
        System.out.printf("%c->%d\n", c, result);
    }
}
