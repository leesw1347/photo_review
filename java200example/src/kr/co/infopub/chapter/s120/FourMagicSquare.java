package kr.co.infopub.chapter.s120;

public class FourMagicSquare extends MagicSquare {

    public FourMagicSquare(int n) {
        super(n);
    }

    public FourMagicSquare() {
        this(4); // 또 다른 자신의 생성자를 호출한다
    }

    public void make() {
//        super.make();
        makeA();
        makeR();
    }

    public void makeR() {
    }

    public void makeA() {
    }
}
