package kr.co.infopub.chapter.s065;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class UsingClass {
    public static void main(String[] args) {
        Object obj1 = new Object();

        // Object 클래스를 상속 받는 변수

        Class<? extends Object> classes = obj1.getClass(); // Class는 해당 클래스의 선언된 메서드와 생성자들을 반환하는 메서드를 제공한다
        // classes 변수는 모든 객체에 대한 객체 자신의 정보 (생성자 관련, 메소드 관련) 등을 제공한다 이를 reflection이라고 한다

        System.out.println(classes.getName()); // 클래스 이름
        System.out.println("----constructor-----");

        // 선언한 생성자
        Constructor[] constructors = classes.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName());
        }

        System.out.println("------Method------");

        // 선언된 메소드를 제공한다
        Method[] methods = classes.getDeclaredMethods();
        for (Method method : methods) { // Object 클래스 내 존재하는 method들을 출력한다
            System.out.println(method.getName()); // 메소드명
        }
    }
}