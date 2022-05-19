package kr.co.infopub.chapter.s115;

import java.util.Scanner;

public class OddMagicSquareMain {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        System.out.println("홀수 정수를 입력하세요");
        OddMagicSquare oddMagicSquare = new OddMagicSquare();
        oddMagicSquare.make();
        oddMagicSquare.print();
    }
}
