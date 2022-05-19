package kr.co.infopub.chapter.s107;

import kr.co.infopub.chapter.s106.Card;
import kr.co.infopub.chapter.s106.CardUtil;

import java.util.Comparator;

/**
 * CardRomp 클래스는 CardComp 클래스의 compare 오버라이딩 메소드의 기능의 역순 기능을 수행한다
 */
public class CardRomp implements Comparator<Card> {
    @Override
    public int compare(Card o1, Card o2) { // 사전식 비교
        Integer ret = 0;

        if (o1.getCardVal().charAt(0) > o2.getCardVal().charAt(0)) {
            ret = -1;
        } else if (o1.getCardVal().charAt(0) < o2.getCardVal().charAt(0)) {
            ret = 1; // o1 SUIT 값이 o2의 SUIT 값보다 작으면 1을 리턴한다
        } else {
            if (CardUtil.toVal(o1.getCardVal().charAt(1)) > CardUtil.toVal(o2.getCardVal().charAt(1))) {
                ret = -1;
            } else if (CardUtil.toVal(o1.getCardVal().charAt(1)) < CardUtil.toVal(o2.getCardVal().charAt(1))) {
                ret = 1;
            }
        }
        return ret;
    }
}
