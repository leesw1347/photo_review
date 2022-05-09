package kr.co.infopub.chapter.s051;

import java.text.MessageFormat;

public class BitNShiftMain {
    // & 연산자
    public static void main(String[] args) {
        int nums1 = 123;
        int nums2 = -123;

        System.out.printf("%d : %s\n", nums1, shifts(nums1));
        System.out.printf("%d : %s\n", nums2, shifts(nums2));
    }

    // 10진수를 2진수 문자열(스트링)로 변환
    private static Object shifts(int nums1) {
        int BITMASK = 1;
        String s = "";
        for (int i = 0; i <= 31; i++) {
//            System.out.println(String.valueOf(nums1) + ", " + (nums1 & BITMASK));
            s = MessageFormat.format("{0}{1}", nums1 & BITMASK, s);
            nums1 >>= 1; // a/=2;
        }
        return s.toString();
    }
}
