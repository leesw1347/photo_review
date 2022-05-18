package kr.co.infopub.chapter.s086;

import kr.co.infopub.chapter.s084.Billboard;

import java.io.PrintWriter;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

// 빌보드 차트를 리스트에 저장하고 출력하기
public class BillboardArrayMain {
    public static void main(String[] args) {
        // 빌보드 차트 정보를 객체에 저장한 다음, 객체를 리스트에 저장하고 출력해보자
        // 리스트는 향상된 배열로 저장할 때 add, 사용할 때는 get을 사용한다

        ArrayList<Billboard> billboards = new ArrayList<>();
        addBillboard(billboards, new Billboard(1, "Despacito", 1, "1111.jpg", "luis fonsi"));
        addBillboard(billboards, new Billboard(2, "Thats What I Like", 2, "2222.jpg", "bruno mars"));
        addBillboard(billboards, new Billboard(3, "Im The One", 3, "3333.jpg", "dj khaled"));

        System.out.println("빌보드차트의 ArrayList 사이즈는 " + billboards.size()); // ArrayList에서 size를 얻기 위해서 size 메소드를 사용한다
        System.out.println("\n-------");
        Iterator<Billboard> billboardIterator = billboards.stream().iterator();
        printAbout(billboards);
        PrintWriter printWriter = FileUtil.reader("billboard");

        while (billboardIterator.hasNext()) {
            Billboard billboard = billboardIterator.next();
            printWriter.println(billboard);
        }
    }

    // 객체를 전달하여 출력
    private static void showAbout(Billboard bb) {
        String sf = String.format("%d, %s, %d, %s, %s",
                bb.getRank(), bb.getSong(), bb.getLastweek(), bb.getImagesrc(), bb.getArtist());
        System.out.println(sf.toString());
    }

    private static void printAbout(ArrayList<Billboard> billboardArrayList) {
        if (billboardArrayList != null && billboardArrayList.size() > 0) {
            Iterator<Billboard> billboardIterator = billboardArrayList.stream().iterator();
            while (billboardIterator.hasNext()) {
                Billboard billboard = billboardIterator.next();
                System.out.println(billboard);
            }
        } else {
            System.out.println("빌보드 차트 ArrayList가 비어있습니다");
        }
    }

    private static boolean addBillboard(ArrayList<Billboard> arrayList, Billboard billboard) {
        boolean add_flag = false;
        if (billboard != null) {
            add_flag = arrayList.add(billboard);
        }
        if (add_flag) {
            System.out.println(MessageFormat.format("billboardList ArrayList에 추가 완료 {0}", billboard));
        }
        return add_flag;
    }
}
