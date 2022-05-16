package kr.co.infopub.chapter.s067;

import java.text.MessageFormat;

public class StringTest {
    // 문자열의 길이, 위치 등 문자열 관련 메서드를 익혀본다
    // 문자열의 길이는 length(), 특정 문자의 위치는 indexOf(문자)를 사용한다
    public static void main(String[] args) {
        String text = "  Hello Java4Android  ";
        String com = "HEllo Java4Android";

        System.out.println(text.charAt(2)); // text[2]
        System.out.println(text.concat("s"));
        System.out.println(text.contains("And"));
        System.out.println(text.equals(com)); // text와 com 내부에 존재하는 문자열이 동일한지 비교한다
        System.out.println(text.equalsIgnoreCase(com)); // 대소문자를 구분하지 않고 문자열 자체가 완전히 일치하는지 분석한다
        System.out.println(text.indexOf("a")); // 문자 'a'가 몇번쨰 인덱스에 존재하는지 확인한다
        System.out.println(text.lastIndexOf("a")); // 마지막 문자 'a'를 몇번째 인덱스에 존재하는지 알 수 있다

        System.out.println(text.trim()); // 문자에 있는 불필요한 공백 데이터를 삭제한다
        text = text.trim();
        System.out.println(MessageFormat.format("text.length() => {0}", text.length()));

        // text[7:]
        System.out.println(MessageFormat.format("text.substring() => {0}", text.substring(7))); // 7번째 문자열부터 문자열을 출력해준다

        // text[7:11]
        System.out.println(MessageFormat.format("text.substring(7,11) => {0}", text.substring(7, 11)));

        System.out.println(MessageFormat.format("replace => {0}", text.replace(" ", "-"))); // 공백을 -로 변경한다

        // replace All
        System.out.println(MessageFormat.format("replaceAll => {0}", text.replaceAll(" ", "-"))); // replaceAll

        System.out.println("toUpperCase => " + text.toUpperCase());
        System.out.println("toLowerCase => " + text.toLowerCase());

        String[] sp = text.split(" "); // 공백을 기준으로 문자열을 split하고 이를 바탕으로 각 문자열별로 length 길이를 출력한다
        for (int i = 0; i < sp.length; i++) {
            System.out.println(i + "\t\t" + sp[i] + "\t\t" + sp[i].length());
        }
    }
}