package kr.co.infopub.chapter.s115;

public class OddMagicSquare {
    private int[][] magic; // 2차원 배열 선언
    private int n; // 마방진 크기 n x n

    public void print() {
        System.out.println();
        System.out.println(n + " is magic : " + isMagic()); // 마방진 완성
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(magic[i][j]);
            }
            System.out.println();
        }
    }

    // row 행에 대한 열의 합
    private int sumRow(int row) {
        int tot = 0;
        for (int i = 0; i < n; i++) {
            tot += magic[row][i];
        }
        return tot;
    }



    private int isMagic() {
        return 0;
    }
}
