package kr.co.infopub.chapter.s108;

public class CardCaseMain {
    public static void main(String[] args) {
        CardCase cardCase = new CardCase();
        cardCase.make();
        cardCase.print();

        System.out.println("------");
        cardCase.shuffle();
        cardCase.print();
        System.out.println("------");
        cardCase.shuffle();
        cardCase.print();
        System.out.println("------");

        cardCase.lambdasort();
        cardCase.lambdaRsort();
    }
}
