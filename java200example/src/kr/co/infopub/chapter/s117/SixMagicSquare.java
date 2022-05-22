package kr.co.infopub.chapter.s117;

public class SixMagicSquare {

    private int[][] magic;
    private int n;

    public int[][] getMagic() {
        return magic;
    }

    public SixMagicSquare(int n) {
        magic = new int[n][n];
        this.n = n;
    }

    public SixMagicSquare() {
        this(6);
    }

    private void makeA() {
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n / 4; j++) {
                if (i == n / 4) {
                    magic[i][j + 1] = 3;
                } else {
                    magic[i][j] = 3;
                }
            }
        }
    }

    public void makeB() {
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n / 2; j++) {
                magic[i][j + n / 2] = 1;
            }
        }

        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n / 2 - (n / 4 - 1); j++) {
                magic[i][j] = 2;
            }
        }
    }

    public void mainCB() {

    }

    public static void main(String[] args) {

    }
}
