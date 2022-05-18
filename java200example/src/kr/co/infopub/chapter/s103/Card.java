package kr.co.infopub.chapter.s103;

public class Card {
    // 데이터 보호 - 은닉화 - 접근 제한자 private
    private String cardVal; // H8, H6

    // 멤버 접근 메서드
    public String getCardVal() {
        return cardVal;
    }

    // 기본 생성자 - 멤버 초기화
    public Card() {
        this("H2"); // 아래와 동일
        // this.cardVal = "H2";
        System.out.println("Card() 기본 생성자 함수 실행");
    }

    // 테스트용
    // 생성자 오버로딩
    public Card(String str) {
        this.cardVal = str; // 문자열은 값 복사
        System.out.println("Card(String str) 생성자 함수 실행 " + this.cardVal);
    }

    // 복사 생성자
    // 카드 객체를 입력으로 받는것을 복사 생성자라고 부른다.
    public Card(Card c) {
        this(c.getCardVal()); // 문자열은 값 복사
        try {
            Card object = (Card) this.clone();
            System.out.println("오브젝트 " + object);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        // this.cardVal = c.getCardVal(); // 동일
    }

    // cardVal 내용 H3
    @Override
    public String toString() {
        return "[" + cardVal + "]";
    }
}
