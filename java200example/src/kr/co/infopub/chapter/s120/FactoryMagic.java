package kr.co.infopub.chapter.s120;

public class FactoryMagic implements AutoCloseable {

    private static FactoryMagic ins; // ins FactoryMagic 객체는 FactoryMagic 클래스 내에서만 사용할 수 있도록 수정

    private FactoryMagic() {
    }

    public static FactoryMagic getInstance() {
        if (ins == null) {
            ins = new FactoryMagic();
        }
        return ins; // FactoryMagic의 객체를 리턴하는데 사용하는데 싱글톤 객체 형태로 적용하기 때문에 이렇게 정의한다
    }

    // 개별적으로 작성한 MagicException 함수를 활용해서 작업을 수행한다
    public IMagicService getMagicSquare(int n) throws MagicException {
        IMagicService im = null;
        if (n <= 2) { // 2보다 작거나 같은 수가 들어오면 throw를 발생시켜서 Exception을 발생시킨다.
            throw new MagicException("2보다 작은 수의 마방진은");
        }

        if (n % 2 != 0) { // g
            im = new OddMagicSquare(n);
        } else if (n % 4 == 0) {
            im = new FourMagicSquare(n);
        } else {
            im = new SixMagicSquare(n);
        }
        return im;
    }

    // try() 구문을 위한 close()
    @Override
    public void close() throws Exception {
        System.out.println("FactoryMagic End!!");
    }
}
