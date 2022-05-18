package kr.co.infopub.chapter.s105;

import java.text.MessageFormat;

public class Card {
    private String cardVal; // H8

    public String getCardVal() {
        return cardVal;
    }

    public Card() {
        int deck = (int) (Math.random() * CardUtil.SUIT.length); // 0 ~ 1 값을 찾는다
        int suit = (int) (Math.random() * CardUtil.VALU.length); // 0 ~ 9 값을 갖는다

        // 임의의 카드값을 갖는다. H6
        cardVal = CardUtil.SUIT[deck] + CardUtil.VALU[suit];
    }

    // 테스트용도
    public Card(String s) {
        this.cardVal = s; // 문자열은 값 복사
    }

    // 복사 생성자
    public Card(Card c) {
        this(c.getCardVal()); // 테스트용도 생성자 함수를 호출한다
    }

    @Override
    public String toString() {
        return MessageFormat.format("[{0}]", getCardVal());
    }
}
