package kr.co.infopub.chapter.s120;

public class SixMagicSquare extends MagicSquare {
    public SixMagicSquare(int n) {
        super(n);
    }

    public SixMagicSquare() {
        this(6); // 6 마방진을 생성
    }

    @Override
    public void make() {
//        super.make();
        makeA();
        makeB();
        makeCD();
        makeMulti();
        makeOdd();
    }

    private void makeB() {
    }

    private void makeA() {
    }

    private void makeOdd() {

    }

    private void makeMulti() {

    }

    private void makeCD() {

    }
}
