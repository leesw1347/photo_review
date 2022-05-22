package kr.co.infopub.chapter.s120;

public class MagicSquare implements IMagicService {
    protected int[][] magic; // 자식이 public처럼 사용
    protected int n; // 자식이 public처럼 사용

    public int[][] getMagic() {
        return magic;
    }

    // 반드시 int 를 입력받아야 하는 생성자
    public MagicSquare(int n) {
        magic = new int[n][n];
        this.n = n;
    }

    // 기본 생성자 제거
//    public MagicSquare() {}
    public void make() {
        // make() 구현했으나 내용 없음
    }

    public void print() {
        System.out.println("MagicSquare::print() 함수 실행");
    }
}
