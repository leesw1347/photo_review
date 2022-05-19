package kr.co.infopub.chapter.s106;

public class CardCaseMain {
    public static void main(String[] args) {
        CardCase cc = new CardCase();
        cc.make();
        cc.print();
        System.out.println("------------");
        cc.shuffle();
        cc.print();
        System.out.println("------------");
        cc.shuffle();
        cc.print();
    }
}
