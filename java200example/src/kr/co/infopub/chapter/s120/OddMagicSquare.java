package kr.co.infopub.chapter.s120;

public class OddMagicSquare extends MagicSquare {

    public OddMagicSquare(int n) {
        super(n); // 중요 -> 부모로 넘긴다. MagicSquare(n)
    }

    public OddMagicSquare() {
        this(3); // 중요 -> 생성자 오버로딩. OddMagicSquare(3)
    }

    public void make() { // 오버라이딩
        super.make();
    }
}
