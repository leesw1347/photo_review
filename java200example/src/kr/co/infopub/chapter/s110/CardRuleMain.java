package kr.co.infopub.chapter.s110;

import kr.co.infopub.chapter.s110.Card;
import kr.co.infopub.chapter.s109.CardCase;

import java.text.MessageFormat;

public class CardRuleMain {
    public static void main(String[] args) {
        CardCase cc = new CardCase(); // 카드 저장
        cc.make(); // 카드 만들고
        CardRule rule = new CardRule(); // 족보

        for (int i = 0; i < 5; i++) {
            System.out.println("-----");
            cc.shuffle();
            cc.print();

//            Card card = cc.getCard(0);
//            Card card1 = cc.getCard(2);
//            int a = rule.rule(card, card1);
        }
    }
}
