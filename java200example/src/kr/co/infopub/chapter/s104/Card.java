package kr.co.infopub.chapter.s104;

public class Card {

    private String cardVal; // H8, H6

    public String getCardVal() {
        return cardVal;
    }

    // 기본(디폴트 생성자)
    public Card() {
        // 0 ~ 3
        int suit = (int) (Math.random() * CardUtil.SUIT.length);

        // 0 ~ 12
        int valu = (int) (Math.random() * CardUtil.VALU.length);

        // 임의의 카드값을 갖는다. H8, H6
        cardVal = CardUtil.SUIT[suit] + CardUtil.VALU[valu];
//        System.out.println("cardVal는 이렇습니다 " + cardVal);
    }

    // 테스트용
    public Card(String s) {
        this.cardVal = s; // 문자열은 값 복사
    }

    // 복사 생성자
    public Card(Card c) { // 다른 카드의 카드값만 가져온다
        this(c.getCardVal()); // 문자열은 값 복사
        // this.cardVal = c.getCardVal(); // 동일
    }

    // cardVal 내용
    @Override
    public String toString() {
        return "[" + cardVal + "]";
    }

    public static void main(String[] args) {
        Card card1 = new Card("H4"); // 생성자 String Argument
        Card card2 = new Card("H4"); // 생성자 String Argument
        Card card3 = new Card(card1); // 복사 생성자 - 값 동일
        System.out.println(Integer.toHexString(card1.hashCode())); // 값은 동일, 다른 해시 ( 다른 객체이기 때문 )
        System.out.println(Integer.toHexString(card2.hashCode())); // 값은 동일, 다른 해시 ( 다른 객체이기 때문 )
        System.out.println(Integer.toHexString(card3.hashCode())); // 값은 동일, 다른 해시 ( 다른 객체이기 때문 )

        System.out.println(card1.equals(card2)); // hashCode 비교 - 중요 - false (equals는 객체의 동일유무를 따지기 때문에 false가 뜬다)
        System.out.println(card1.equals(card3)); // hashCode 비교 - 중요 - false

        for (int i = 0; i < CardUtil.SUIT.length; i++) {
            for (int j = 0; j < CardUtil.VALU.length; j++) {
                // 값은 같을 수 있지만, 해시코드는 다음과 같다 (고유하다. 값이 같을 수 없다)
                Card card = new Card(); // 임의로 카드 생성 - 기본생성자
                System.out.printf("%s\t", card);
            }
            System.out.println(); // 10개 출력 후 한 칸 아래로 내린다
        }
    }
}
