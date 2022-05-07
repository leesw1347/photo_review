package kr.co.infopub.chapter.s037;

public class BioSwitch {
    // 상수
    private static final int PHYSICAL = 23;
    private static final int EMOTIONAL = 28;
    private static final int INTELLECTUAL = 33;
    private static final int PERCENT = 100;

    // 메서드 선언 (method declaration)
    private static String textInfor(int index, double value) {
        String result = "";
        switch (index) {
            case PHYSICAL -> result = "신체지수:";
            case EMOTIONAL -> result = "감정지수:";
            case INTELLECTUAL -> result = "지성지수:";
            default -> result = "미결정 : ";
        }
        return result.trim().toString() + (value * PERCENT);
    }

    public static void main(String[] args) {
        int index = PHYSICAL;
        double value = 0.86;
        String st = textInfor(index, value);
        System.out.println(st);
    }
}
