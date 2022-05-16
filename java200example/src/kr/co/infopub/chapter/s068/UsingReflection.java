package kr.co.infopub.chapter.s068;

import java.lang.reflect.Method;
import java.text.MessageFormat;
import java.util.Arrays;

public class UsingReflection {
    public static String toModi(int n) {
        // Class로 한 클래스에 대한 정보를 출력한다
        String s = "";
        switch (n) {
            case 0:
                s = "";
                break;
            case 1:
                s = "public";
                break;
            case 2:
                s = "private";
                break;
            case 4:
                s = "protected";
                break;
            case 8:
                s = "static";
                break;
            case 10:
                s = "private static";
                break;
            case 9:
            case 137:
                s = "public static";
                break;
            case 17:
                s = "public natvie";
                break;
            case 257:
                s = "public native";
                break;
            case 260:
                s = "protected native";
                break;
            case 273:
                s = "public final native";
                break;
//            default:
//                Syst IllegalStateException("Unexpected value: " + s);
        }
        return s;
    }

    public static String toRe(String msg) {
        String s = "";
        if (msg.indexOf("[") != -1) {
            if (msg.contains("[C")) {
                s = msg.substring(msg.indexOf(" ") + 1).trim(); // 공백 다음 문자열부터 쭉 뽑아준다
                s = s.replace("[C", "char[");
            } else if (msg.contains("[L")) {
                s = msg.substring(msg.indexOf(" ") + 1).trim();
                s = s.replace("[L", "").replace(";", "");
                s = s.concat("[]");
            } else if (msg.contains("[B")) {
                s = msg.substring(msg.indexOf(" ") + 1).trim();
                s = s.replace("[B", "byte[]");
            } else if (msg.indexOf(" ") != -1) {
                // msg 내 " "가 있다면, substring을 활용해서 뽑아낸다
                s = msg.substring(msg.indexOf(" ") + 1).trim();
            } else {
                s = msg.trim();
            }
        }
        return s;
    }

    public static void main(String[] args) {
        String s = "";
        Object obj1 = new Object();
        String[] Result = new String[1024];

        try {
            Class<?> classes = Class.forName("java.lang.String");
            System.out.println("----Method 찾기-----");
            Method[] methods = classes.getDeclaredMethods();
            Integer methodIndex = 0;
            for (Method method : methods) {
                if (method.getModifiers() > 4000) {
                    continue;
                }
                Result[methodIndex] = MessageFormat.format("{0}\t\t" +
                                "{1}\t\t" +
                                "{2}(",
                        toModi(method.getModifiers()),
                        toRe(String.valueOf(method.getReturnType())),
                        method.getName());
//                System.out.printf("%s\t\t", toModi(method.getModifiers())); // 제한자 종류
//                System.out.printf("%-30s\t\t", toRe(method.getReturnType().toString()));
//                System.out.printf("%s", method.getName()); // 클래스 이름
//                System.out.printf("(", ""); // 2개이상일 경우에는 ,로 표시

                Class[] aa = method.getParameterTypes(); // 메소드별로 파라미터 타입을 분서갛ㄴ다
                for (int j = 0; j < aa.length; j++) {
//                    System.out.print(MessageFormat.format("{0} {1}", aa[j], aa[j].getName()));
//                    System.out.printf("%s", toRe(aa[j].getName())); // argument 이름
                    if (j != aa.length - 1) {
//                        System.out.print(",");
                    }
                }
//                System.out.printf(")", "");
//                System.out.println();
                methodIndex++;
            }

            System.out.print("-----생성자 찾기-----");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
