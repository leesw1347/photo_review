package kr.co.infopub.chapter.s083;

import java.nio.file.FileSystemNotFoundException;

public class BillboardMain2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Data를 객체로 저장
//        Billboard b1 = new Billboard("1", "Despacito",
//                1, "https://www.billboard.com/imaged/q61808osztw.jpg", "luis fonsi");
        // 객체 출력
//        showAbout(b1);

        // 객체로 전달
//        Billboard b = b1; // 주소를 복사한 후, 주소의 객체 정보를 출력한다
//        System.out.println(b);
//        System.out.println(b1);
//        showAbout(b);

    }

    public static void showAbout(Billboard bb) { // 객체를 전달하여 출력
        String sf = String.format("%d, %s, %d, %s, %s",
                bb.getRank(), bb.getSong(), bb.getLastweek(),
                bb.getImagesrc(), bb.getArtist());
        System.out.println(sf);
    }
}
