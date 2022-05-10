package kr.co.infopub.chapter.s057;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForeachLambdaLotto {
    public static void main(String[] args) {
        List<Integer> mmlist = Arrays.asList(1, 6, 16, 22, 23, 33);
        mmlist.forEach(
                m -> {
                    System.out.print(String.valueOf(m) + " ");
                }
        );
        System.out.println();
        Consumer<Integer> consumer = (Integer m) -> {
            System.out.printf(m + "\t");
        };
        mmlist.forEach(consumer);
        System.out.println();
    }
}
