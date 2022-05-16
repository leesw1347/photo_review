package kr.co.infopub.chapter.s070;

import java.text.MessageFormat;

public class StringBuilderMain {
    public static void main(String[] args) {
        //synchronized 안한 StringBuffer
        StringBuilder sbu = new StringBuilder();
        sbu.append("I")
                .append(" go")
                .append(" to school.");
        print(sbu);

//        System.out.println(sbu.substring(7, 11)); == sch
        sbu.replace(7, 11, "");
        print(sbu);

        sbu.reverse();
        print(sbu);

        sbu.delete(1, 3); // sbu[1:3] 삭제
        print(sbu);

        String ss = sbu.substring(0); // sub[0:] 부터 데이터를 가져온다
        print(new StringBuilder("=====\n" + new StringBuilder(ss)));
        print(sbu);

        String st = sbu.substring(0, 4); // sbu[0:4] 까지의 데이터를 가져온다
        System.out.print("====\n");
        System.out.println(st);
        System.out.println(sbu);
    }

    public static void print(StringBuilder sb) {
        System.out.print(MessageFormat.format("{0} {1}", sb.toString(), Integer.toHexString(sb.hashCode())));
        System.out.println();
    }
}
