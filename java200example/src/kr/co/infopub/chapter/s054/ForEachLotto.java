package kr.co.infopub.chapter.s054;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;

// 향상된 for와 배열
public class ForEachLotto {
    public static void main(String[] args) {
        int[] mm = {1, 6, 16, 22, 23, 33};
//        Stream stream = (Stream) Arrays.stream(mm);
//        stream.forEach(new Consumer() {
//            @Override
//            public void accept(Object o) {
//                System.out.print(o.toString() + " ");
//            }
//        });

        for (int m : mm) {
            System.out.print(String.valueOf(m)+ " ");
        }

        System.out.println();
    }
}
