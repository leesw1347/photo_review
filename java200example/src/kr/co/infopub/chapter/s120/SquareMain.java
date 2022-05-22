package kr.co.infopub.chapter.s120;

public class SquareMain {
    public static void main(String[] args) {
        System.out.println("정수 마방진을 생성");
        int n = 3;
        MagicSquare magicSquare = null;
        try {
            FactoryMagic factoryMagic = FactoryMagic.getInstance(); // auto closeable
            IMagicService iMagicService = factoryMagic.getMagicSquare(n);

            // 3,4,6을 팩토리가 처리한다
            MagicPrint.print((MagicSquare) iMagicService);


        } catch (MagicException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
