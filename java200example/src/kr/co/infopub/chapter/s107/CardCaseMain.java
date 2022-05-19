package kr.co.infopub.chapter.s107;

public class CardCaseMain {
    public static void main(String[] args) {

        CardCase cardCase = new CardCase();
        cardCase.make();
        cardCase.print();
        System.out.println("-----");
        cardCase.shuffle(); // 카드 섞기
        cardCase.print();
        System.out.println("-----");
        cardCase.sort(); // 순차정렬
        cardCase.print();
        System.out.println("-----");
        cardCase.rsort(); // 역순정렬
        cardCase.print();
    }
}
