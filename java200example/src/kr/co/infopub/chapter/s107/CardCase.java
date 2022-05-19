package kr.co.infopub.chapter.s107;

import kr.co.infopub.chapter.s106.Card;
import kr.co.infopub.chapter.s106.CardUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardCase {
    private static boolean isCorrectSort = false;

    // aggregation : CardCase는 Card로 구성된다
    private List<Card> cards = new ArrayList<>();

    public CardCase() {
        cards.clear(); // 내용 지우기
    }

    // List 변환
    public List<Card> getCards() {
        return cards;
    }

    // List에 저장된 Card 개수
    public int count() {
        return cards.size(); // 저장된 Card 개수
    }

    // s106 CardCase에서 기능 추가
    public void sort() {
        isCorrectSort = true;
        cards.sort(new CardComp());
    }

    public void rsort() {
        cards.sort(new CardRomp());
        // sort를 이용하지 않고, cards ArrayList를 역순으로 뿌려주는 방식으로도 가능할듯
    }

    // List의 index번째 Card
    public Card getCard(int index) {
        Card card = null;
        if (index >= 0 && cards.size() < index) {
            card = cards.get(index); // index번째 card
        }
        return card;
    }

    // 서로 다른 카드 20장 만들기
    public void make() {
        cards.clear(); // 카드 내용 지우기
        int suit = CardUtil.SUIT.length; // 2
        int value = CardUtil.VALU.length; // 10
        int count = 0;

        // 서로 다른 20개의 카드를 만든다
        while (count != value * suit) { // 20장이 될때까지
            Card c = new Card(); // 임의의 카드를 만든다
            if (!cards.contains(c)) { // contains -> equals()를 이용해 비교
                cards.add(c); // 같은 객체가 아니라면 저장
                count++;
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards); // 카드 섞기
    }

    public void print() {
        int value = CardUtil.VALU.length;
        for (int i = 0; i < cards.size(); i++) {
            Card c = cards.get(i);
            System.out.printf("%s ", c.toString());
            if ((i + 1) % value == 0) { // 카드 10개씩 출력하기 위해서 line feed
                System.out.println();
            }
        }
    }
}
