package kr.co.infopub.chapter.s114;

import java.util.Scanner;

public class OddMagicSquareMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        OddMagicSquare odd = new OddMagicSquare(n);
        odd.make();
        odd.print();
    }
}
