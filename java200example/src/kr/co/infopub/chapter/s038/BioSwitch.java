package kr.co.infopub.chapter.s038;

// enum, switch case 활용
public class BioSwitch {
    // 메서드 선언
    public static String textInfor(PEI index, double value) {
        String result = "";
        switch (index) {
            case PHYSICAL -> result = "신체지수:";
            case EMOTIONAL -> result = "감정지수:";
            case INTELLECTUAL -> result = "지성지수:";
            default -> result = "미결정:";
        }
        return result + (value * PEI.PERCENT);
    }

    public static void main(String[] args) {
        PEI index = PEI.PHYSICAL;
        double value = 0.86;

        System.out.println("신체 지수 주기값 : " + index.getPeiValue()); // enum 값을 int로 변환
        String st = textInfor(index, value);
        System.out.println(st);
        System.out.println(index.ordinal()); // 0번째 인덱스에 있는 값
        System.out.println(index.name()); // name
        System.out.println(index);
        System.out.println(index.getPeiValue());
    }
}
