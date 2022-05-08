package kr.co.infopub.chapter.s038;

// 상수 묶음 클래스 - enum
public enum PEI {
    PHYSICAL(23),
    EMOTIONAL(28),
    INTELLECTUAL(33);

    public static final Integer PERCENT = 100;

    private int peiValue = 0; // 이렇게 설정하면 상수값이기 때문에 error가 난다

    PEI(int peiValue) { // enum 값을 초기화할 수 있는 생성자
        this.peiValue = peiValue;
    }

    public int getPeiValue() {
        return peiValue;
    }
}

// 생성자와 사용자 정의 메소드가 없는 enum의 예임
enum FRUIT {
    APPLE, BANANA, MANGO
}