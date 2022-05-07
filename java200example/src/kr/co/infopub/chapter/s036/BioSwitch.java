package kr.co.infopub.chapter.s036;

public class BioSwitch {
    private static Integer pos = 100;

    // 조건에 따라 신체, 감정, 지성값을 출력한다
    public static String textInfor(int index, double value) {
        String result = "";
        switch (index) {
            case 23:
                result = "신체 지수 : ";
                break;
            case 28:
                result = "감성 지수 : ";
                break;
            case 33:
                result = "지성 지수 : ";
                break;
        }
        return result + (value * BioSwitch.pos);
    }

    public static void main(String[] args) {
        int index = 23;
        double value = 0.86;
        String st1 = textInfor(index, value);
        System.out.println(st1.strip().toString());
    }
}
