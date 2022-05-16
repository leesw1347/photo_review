package kr.co.infopub.chapter.s062;

public class FormatTryCatch {

    public static void main(String[] args) {
        String sNum = "123";
        String nNum = "h";

        try {
            /**
             * 문자형을 기본 타입으로 변환할 때는 랩퍼(Wrapper) 클래스를 사용한다
             */
            int a = Integer.parseInt(sNum); // String 데이터를 Integer.parseInt를 활용해서 integer 형태로 변환한다
            System.out.println(a);
        } catch (NumberFormatException ee) {
            System.out.println(ee.getMessage());
            System.err.println(ee.getMessage());
        } catch (Exception ex) {
            System.out.println("야 잘 좀 넣어");
        } finally {
            System.out.println("난 수행되어야만 해");
        }
    }
}