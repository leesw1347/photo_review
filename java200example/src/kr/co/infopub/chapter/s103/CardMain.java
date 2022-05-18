package kr.co.infopub.chapter.s103;

public class CardMain {
    public static void main(String[] args) {
        String csuit1 = "H"; // suit + value
        String cvalu1 = "6"; // suit + value

        String csuit2 = "H"; //suit + value
        String cvalu2 = "3"; //suit + value
        // 객체 생성
        Card c1 = new Card("H6"); // 생성자 (String Argument) H6
        Card c2 = new Card(csuit1 + cvalu1); // 생성자 (String Argument) H6 전달
        Card c3 = new Card(); // 기본 생성자 H2를 가짐
        Card c4 = new Card(csuit2 + csuit1); // 생성자 (String Argument) H6 전달

        System.out.printf("%s,%s,%s,%s\n", c1, c2, c3, c4);
    }
}
