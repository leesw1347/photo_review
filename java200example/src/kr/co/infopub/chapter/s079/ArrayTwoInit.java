package kr.co.infopub.chapter.s079;

public class ArrayTwoInit {
    // 2차원 배열 익혀본다
    // 배열에 대한 배열로 행과 열로 채워져 있는 교실의 책상을 연상한다
    public static void main(String[] args) {
        System.out.println("2차원 배열 방법1");
        int[][] a = new int[4][3];
        a[0][0] = 1; // 0부터 시작
        a[0][1] = 2;
        println(a);

        System.out.println("2차원 배열 방법 2");
        int[][] b = new int[3][]; // 3X? 파스칼의 삼각형에 사용
        b[0] = new int[4]; // 1행 4열
        b[1] = new int[5]; // 1행 5열
        b[2] = new int[3]; // 1행 3열

        System.out.println("2차원 배열 방법 3");
        int[][] c = new int[][]{
                {1, 2, 3, 4, 5},
                {2, 3, 4, 5, 6},
                {6, 7, 8, 9, 0}
        };
        println(c);

        System.out.println("copy 1");
        int[][] d = new int[c.length][c[0].length]; // 3X5
        for (int i = 0; i < c.length; i++) { // deep copy
            System.arraycopy(c[i], 0, d[i], 0, c[i].length);
        }
        println(c);
    }

    public static void println(int[][] p) {
        for (int i = 0; i < p.length; i++) { // 행을 의미함
            for (int j = 0; j < p[i].length; j++) { // 열을 의미함
                System.out.print("[" + p[i][j] + "] ");
            }
            System.out.println();
        }
    }
}
