package kr.co.infopub.chapter.s114;

public class OddMagicSquare {
    private int[][] magic; // 2차원 배열 선언
    private int n; // 마방진 크기 n X n

    public int[][] getMagic() {
        return magic;
    }

    public OddMagicSquare() {
        this(3); // 생성자 오버로딩
    }

    public OddMagicSquare(int i) {
        magic = new int[i][i]; // 2차원 배열 생성, 초기화
        this.n = i;
    }

    public void make() { // 홀수 마방진 만들기
        int x = 0; // 가장 윗줄
        int y = n / 2; // 중앙
        for (int i = 1; i <= n * n; i++) { // 2번째 행부터 차례대로 행렬을 생성한다
            int tempX = x; // 옮겨지기 전 위치 저장
            int tempY = y;
            System.out.printf("(%d, %d)\t", x, y);
            magic[x][y] = i; // 1 ~ n x n 대입;

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
            if (magic[x][y] != 0) {
                x = tempX + 1; // x 원위치 + 1;
                y = tempY; // y 원위치
            }
        }
    }

    public void print() {
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(magic[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
