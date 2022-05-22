package kr.co.infopub.chapter.s119;

public class SquareMain {
    public static void main(String[] args) {
        System.out.println("정수 마방진을 생성");
        int n = 3;
        MagicSquare magicSquare = null;
        if (n > 2 && n % 2 == 1) { // 3이상 홀수 값들만 체크
            magicSquare = new OddMagicSquare(n); // 다형성 - 부모 타입으로 자식을 생성할 수 있다
            System.out.println("OddMagicSquare 생성 완료 " + magicSquare);
        } else if (n > 2 && n % 4 == 0) { // 짝수 다형성 마방진 - 부모 타입으로 자식을 생성할 수 있다
            magicSquare = new FourMagicSquare(n);
            System.out.println("FourMagicSquare 생성 완료 " + magicSquare);
        } else {
            System.out.printf("%s", "만들 수 없는 마방진입니다");
            return;
        }
        MagicPrint.print(magicSquare); // 다형성 - 부모 타입으로 자식을 받을 수 있다
    }
}
