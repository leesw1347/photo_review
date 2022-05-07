package kr.co.infopub.chapter.s033;

public class GeoPoint {
    public static void main(String[] args) {
        // 실수 변수
        double latitude1 = 37.5212;
        double longitude1 = 127.0074;

        double latitude2 = 35.1378;
        double longitude2 = 129.0454;

        // (위도, 경도) 객체
        Geo geo1 = new Geo();
        geo1.latitude = latitude1;
        geo1.longitude = longitude1;

        System.out.println(geo1.latitude + "\t" + geo1.longitude);

        Geo geo2 = new Geo();
        geo2.latitude = latitude2;
        geo2.longitude = longitude2;

        // 객체전달
        Geo geo = geo1;
        System.out.println(geo.equals(geo1));
        System.out.println(geo.latitude + "\t" + geo.longitude);
    }
}
