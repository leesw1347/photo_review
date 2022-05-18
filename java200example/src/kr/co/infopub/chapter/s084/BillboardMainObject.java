package kr.co.infopub.chapter.s084;

import java.util.Arrays;
import java.util.Iterator;

public class BillboardMainObject {
    public static void main(String[] args) {

        // 빌보드 객체를 생성하는데, 생성하면서 순위, 곡명, 전 주의 순위 등을 정의해준다
        Billboard b1 = new Billboard(1, "Despacito", 1,
                "https://www.billboard.com/images/pref_images/q61808osztw.jpg",
                "luis fonsi");

        Billboard b2 = new Billboard(2, "Thats's What I Like", 2,
                "https://www.billboard.com/images/pref_images/q59725qvpol.jpg", "bruno mars");

        Billboard b3 = new Billboard(3, "I'm The One", 3,
                "https://www.billboard.com/images/pref_images/q64532p164x.jpg", "dj khaled");

        showAbout(b1);
        showAbout(b2);
        showAbout(b1, b2);

        Billboard[] billboards = new Billboard[3];
        billboards[0] = b1;
        billboards[1] = b2;
        billboards[2] = b3;

        showAbout(billboards);

    }

    /**
     * 객체를 전달하여 다중
     */
    private static void showAbout() {
    }

    public static final void showAbout(Billboard bb) { // 객체를 전달하여 출력
        System.out.println("1-------------");
        String sf = String.format("%d, %s, %d, %s, %s",
                bb.getRank(), bb.getSong(), bb.getLastweek(), bb.getImagesrc(), bb.getArtist());
        System.out.println(sf);
    }

    // 객체를 전달하여 출력 (Billobard 파라미터를 다수 입력받을 수 있다)
    // varargs(...)을 이용하여 객체의 개수에 관계 없이 출력한다.
    private static void showAbout(Billboard... b) {
        System.out.println("\n2=======");
        Iterator<Billboard> billboardIteratr = Arrays.stream(b).iterator(); // while에서 해당 코드를 입력하면 무한반복이 됨
        while (billboardIteratr.hasNext()) {
            Billboard bb = billboardIteratr.next();
            System.out.println(bb);
        }
    }

}
