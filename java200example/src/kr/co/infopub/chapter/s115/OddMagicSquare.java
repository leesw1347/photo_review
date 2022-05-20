package kr.co.infopub.chapter.s115;

import java.text.MessageFormat;

public class OddMagicSquare {
    private int[][] magic; // 2차원 배열 선언
    private int n; // 마방진 크기 n x n

    public void print() {
        System.out.println();
        System.out.println(n + " is magic : " + isMagic()); // 마방진 완성
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(magic[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void make() { // 홀수 마방진 만들기
        int x = 0; // 가장 윗줄
        int y = n / 2; // 중앙
        for (int i = 1; i <= n * n; i++) { // 2번째 행부터 차례대로 행렬을 생성한다
            int tempX = x; // 옮겨지기 전 위치 저장
            int tempY = y;
            System.out.printf("(%d, %d)\t", x, y);
            this.magic[x][y] = i; // 1 ~ n x n 대입;

            // 위로이동
            if (x - 1 < 0) {
                x = n - 1;
            } else {
                x--; // 정상 x = x-1;
            }
            // 왼쪽으로 이동
            if (y - 1 < 0) {
                y = n - 1; // 왼쪽벽으로 이동
            } else {
                y--; // 정상 y = y-1;
            }

            // 이미 존재
            if (this.magic[x][y] != 0) {
                x = tempX + 1; // x 원위치 + 1;
                y = tempY; // y 원위치
            }
        }
    }

    public void make(int[][] magic, int n) { // 홀수 마방진 만들기
        this.magic = magic;
        int x = 0; // 가장 윗줄
        int y = n / 2; // 중앙
        for (int i = 1; i <= n * n; i++) { // 2번째 행부터 차례대로 행렬을 생성한다
            int tempX = x; // 옮겨지기 전 위치 저장
            int tempY = y;
            System.out.printf("(%d, %d)\t", x, y);
            this.magic[x][y] = i; // 1 ~ n x n 대입;

            // 위로이동
            if (x - 1 < 0) {
                x = n - 1;
            } else {
                x--; // 정상 x = x-1;
            }
            // 왼쪽으로 이동
            if (y - 1 < 0) {
                y = n - 1; // 왼쪽벽으로 이동
            } else {
                y--; // 정상 y = y-1;
            }

            // 이미 존재
            if (this.magic[x][y] != 0) {
                x = tempX + 1; // x 원위치 + 1;
                y = tempY; // y 원위치
            }
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

    // col 열에 대한 행의 합
    private int sumCol(int col) {
        int tot = 0;
        for (int i = 0; i < n; i++) {
            tot += magic[i][col];
        }
        return tot;
    }

    // 역 대각선 (2,0), (1,1), (0,2)
    private int sumDia() {
        int tot = 0;
        for (int i = 0; i < n; i++) {
            tot += magic[i][i];
        }
        return tot;
    }

    // 대각선 (0,0), (1,1), (2,2)
    private int sumReverseDia() {
        int tot = 0;
        for (int i = 0; i < n; i++) {
            tot += magic[i][n - 1];
        }
        return tot;
    }

    public OddMagicSquare() {
        this(5);
    }

    public OddMagicSquare(int n) {
        this.n = n;
        // magic Matrix 배열 객체 생성
        magic = new int[n][n];
    }

    // 마방진이 잘 되었는가를 판단
    private boolean isMagic() {
        boolean isM = true;
        int[] m = new int[2 * n + 2]; // 행수 n +  열수 n + 대각선 1 + 역대각선1

        for (int i = 0; i < n; i++) { // n = 5
            m[i] = sumRow(i); // 0,1,2,3,4 행의 합
            m[i + n] = sumCol(i); // 0,1,2,3,4 열의 합
        }

        m[2 * n] = sumReverseDia(); // 역 대각선의 합
        System.out.println(MessageFormat.format("m의 값은 {0}", m));
//        Arrays.stream(m).iterator()
        m[2 * n + 1] = sumDia(); // 대각선의 합

        for (int i = 1; i < m.length; i++) {
            System.out.print(m[i] + "\t");
            if (m[0] == 0 || m[0] != m[i]) {
                isM = false;
                break;
            }
        }
        System.out.println();
        return isM;
    }
}
