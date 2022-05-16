package kr.co.infopub.chapter.s061;

public class BitShifting {
    private static final Integer BITMASK = 1;

    public String makeBit(int value) {
        // char 배열을 String으로 만들기 위해
        char[] val = new char[32];
        try {
            for (int i = 32; i >= 0; i--) { // i가 32부터 시작하면서 i가 0보다 크거나 같을 경우까지만 반복한다
                if ((value & BITMASK) == 1) { // 1&1일때만1 그외에는 0을 나타낸다
                    val[i] = '1';
                } else {
                    val[i] = '0';
                }
                value >>>= 1; // 부호 무시하고 오른쪽으로 이동
//                value = (value >> 1) ;
            }

        } catch (ArrayIndexOutOfBoundsException ex) {
            ex.printStackTrace();
        }
        System.out.println(val.length);
        System.out.println(BITMASK);
        return new String(val);
    }

    public static void main(String[] args) {
        int ival = 2345;
        int eval = -2345;

        BitShifting bitsh = new BitShifting();
        String vals = bitsh.makeBit(ival);
        System.out.println(vals);

        char[] vs = vals.toCharArray(); // 문자열 내부에 저장된 문자들을 char[]로 반환한다
        System.out.println(vs[0]);
    }
}