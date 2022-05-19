package kr.co.infopub.chapter.s109;

public class CardCaseMain {
    public static void main(String[] args) {
        CardCase cc = new CardCase();
        cc.make();
        cc.print();
        System.out.println("shuffle --------");
        cc.shuffle();
        cc.print();
        System.out.println("shuffle ---------");
        cc.shuffle();
        cc.print();
        System.out.println("sort ----------");
        cc.sort();
        cc.print();
        System.out.println("rsort ---------");
        cc.rsort();
        cc.print();
    }
}
