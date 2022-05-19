package kr.co.infopub.chapter.s110;

import kr.co.infopub.chapter.s107.CardUtil;

import java.text.MessageFormat;

/**
 * 람다와 :: 를 이용해서 카드를 순서대로 정렬하는 방법을 익혀보자
 * 비교 기준 클래스 없이 람다와 :: 을 이용하여 기준을 만든다
 */
public class Card {

    // 추가된 static 비교 기준 메소드
    public static int compareCard(Card c1, Card c2) {
        return c1.getCardVal().compareTo(c2.getCardVal());
    }

    // 추가된 static 비교 기준 메소드
    public static int compareRCard(Card c1, Card c2) {
        return -(c1.getCardVal().compareTo(c2.getCardVal()));
    }

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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cardVal == null) ? 0 : cardVal.hashCode());
        return result;
    }

    // 같은 값을 가지는 카드끼리도 카드1.equals(카드2)는 false가 나오기 때문에,
    // 갑ㅌ은 값을 가지면 같은 객체로 만들어야할 때, equals()를 오버라이딩한다
    @Override
    public boolean equals(Object obj) {
        Card cb = (Card) obj;
        if (cardVal.equals(cb.getCardVal())) {
            return true;
        }
        return false;
    }
}
