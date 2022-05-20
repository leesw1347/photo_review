package kr.co.infopub.chapter.s116;

import kr.co.infopub.chapter.s115.OddMagicSquare;

public class FourMagicSquare extends OddMagicSquare {
    private int[][] magic;
    private int n;


    public int[][] getMagic() {
        return magic;
    }

    public FourMagicSquare(int n) {
        magic = new int[n][n];
        this.n = n;
    }

    public FourMagicSquare() {
        this(4);
    }

    private void makeR() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

            }
        }
    }

    private void makeA() {
        for (int i = 0; i < n * n; i++) {
            magic[i / n][i % n] = i + 1;
        }
    }

    public static void main(String[] args) {
        // 4배수 마방진을 만들어보자
    }
}
