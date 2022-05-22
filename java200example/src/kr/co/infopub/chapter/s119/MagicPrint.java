package kr.co.infopub.chapter.s119;

import kr.co.infopub.chapter.s119.MagicSquare;

public class MagicPrint {

    // 객체를 생성하지 않고, 사용한다.
    public static void print(MagicSquare magicSquare) {
        magicSquare.make();
        magicSquare.print();
    }
}
