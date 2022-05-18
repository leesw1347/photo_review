package kr.co.infopub.chapter.s105;

public class CardMain2 {
    public static void main(String[] args) {
        Card c1 = new Card("H4"); // 생성자 String Argument
        Card c2 = new Card("H4"); // 생성자 String Argument
        System.out.println(c1.hashCode()); // 값 일치, 같은 해시
        System.out.println(c2.hashCode()); // 값 일치, 같은 해시

        System.out.println(c1.getCardVal()); // 값 동일
        System.out.println(c2.getCardVal()); // 값 동일
        System.out.println(c1.equals(c2)); // hashCode 비교 - 오버라이딩 - 중요
    }
}
