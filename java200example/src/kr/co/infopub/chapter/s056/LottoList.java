package kr.co.infopub.chapter.s056;

import java.util.ArrayList;
import java.util.List;

public class LottoList {
    public static void main(String[] args) {
        List<Integer> ilist = new ArrayList<>();
        // 넣기
        for (int i = 0; i <= 10; i++) {
            ilist.add(i);
        }

        // 가져오기
        for (int i = 0; i < ilist.size(); i++) {
            int m = ilist.get(i);
            System.out.print(String.valueOf(m) + " ");
        }
        System.out.println();
    }
}
