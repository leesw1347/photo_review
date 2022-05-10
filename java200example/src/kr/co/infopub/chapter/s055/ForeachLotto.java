package kr.co.infopub.chapter.s055;

public class ForeachLotto {
    public static void print(int... mm) {
        for (int m : mm) {
            System.out.print(m + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] mm = {1, 6, 16, 22, 23, 33};
        print(mm); // 배열도 되고
        int a = 1, b = 6, c = 16;
        print(a); // 1개짜리도 되고
        print(a, b); // 2개짜리도 되고
        print(a, b, c); // 3개짜리도 되고
    }
}
