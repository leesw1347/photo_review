package kr.co.infopub.chapter.s066;

import java.text.MessageFormat;

public class StringMain {
    public static void main(String[] args) {

        // String(문자열)을 이용해 도시 이름 비교하기
        // String(문자열)이 동일한지 판별해보자
        // String은 new로 생성한 문자열과 new로 생성하지 않은 문자열이 있다
        String city1 = "Asia";
        String city2 = "Europe";
        String city3 = new String("Asia");
        String city7 = "Asia";

        System.out.println(city1);
        System.out.println(city1.length());
        System.out.println("city1 == city2 = " + (city1 == city2));
        System.out.println("city1.equals(city2) = " + city1.equals(city2));
        System.out.println("city1 == city3 = " + city1 == city3);
        System.out.println("city1 == city7 = " + city1 == city7);
        System.out.println(city1.equals(city3)); // "Asia" == "Asia" (==는 레퍼런스를 체크하는거고, equals는 해시코드를 이용해서 비교한다)
        System.out.println("city1 확인 " + city1.hashCode()); // equals는 문자열의 hashcode를 뽑아내서 가져오는거기 때문에 레퍼런스 체크가 아님
        System.out.println("city3 확인 " + city7.hashCode());

        String city4 = String.format("%s-%s", city1, city2);
        System.out.println(MessageFormat.format("city4: {0}", city4));

        String city5 = city1 + "-" + city2 + 1 + 2;
        System.out.println(MessageFormat.format("city5: {0}", city5));

        String city6 = 1 + 2 + city1 + "-" + city2;

    }
}