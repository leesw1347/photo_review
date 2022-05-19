package kr.co.infopub.chapter.s107;

import kr.co.infopub.chapter.s106.Card;
import kr.co.infopub.chapter.s106.CardUtil;

import java.util.Comparator;

public class CardComp implements Comparator<Card> {

    @Override
    public int compare(Card o1, Card o2) {
        Integer ret = 0;
        // 문자열 compareTo - 사전식 비교
        if (o1.getCardVal().charAt(0) > o2.getCardVal().charAt(0)) {
            ret = 1; // o1 카드의 Alpha 값이 크면 1을 리턴
        } else if (o1.getCardVal().charAt(0) < o2.getCardVal().charAt(0)) {
            ret = -1; // o1 카드의 Alpha 값이 작으면 -1을 리턴
        } else {
            // 만약 값을 경우에는 Value 값을 분석해서 리턴값을 지정한다
            if (CardUtil.toVal(o1.getCardVal().charAt(1)) > CardUtil.toVal(o2.getCardVal().charAt(1))) {
                ret = 1; // o1의 Value 값이 더 클 경우
            } else if (CardUtil.toVal(o1.getCardVal().charAt(1)) < CardUtil.toVal(o2.getCardVal().charAt(1))) {
                ret = -1;
            }
        }
        return ret;
    }
}
