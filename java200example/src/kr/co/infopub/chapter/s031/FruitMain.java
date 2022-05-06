package kr.co.infopub.chapter.s031;

// 상수의 묶음
public class FruitMain {
    public static void main(String[] args) {
        FRUIT pear = FRUIT.APPLE;
        FRUIT pear2 = FRUIT.MANGO;
        System.out.println(pear);
        System.out.println(pear2);
        System.out.println(pear.name());
        // oridnal을 통해서 enumerate에서의 index를 구할 수 있다.
        System.out.println(pear.ordinal()); // 선언될 때 순서0
        System.out.println(pear2.ordinal()); // 선언될 때 순서2

        FRUIT[] fruits = FRUIT.values();

        int enum_length = fruits.length;
        // enum 타입의 길이를 구한다
        System.out.println("FRUIT enum의 사이즈는 " + enum_length);
    }
}
