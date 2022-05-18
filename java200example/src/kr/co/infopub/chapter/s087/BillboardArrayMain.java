package kr.co.infopub.chapter.s087;

import kr.co.infopub.chapter.s084.Billboard;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Iterator;

// 빌보드 차트를 리스트에 저장하고 출력하기
public class BillboardArrayMain {
    public static void main(String[] args) {
        // 파일로 저장한 빌보드 차트 정보를 읽어본다
        // 문자열(텍스트)를 읽을 때는 BufferedReader를 사용한다
        try {
            String filename = "bill.txt";
            System.out.println(MessageFormat.format("filename {0}", filename));
            BufferedReader bufferedReader = new BufferedReader(
                    new FileReader(filename)
            );
            String msg = "";

//            while ((msg = bufferedReader.readLine())) {
//                System.out.print(msg);
//            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
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
