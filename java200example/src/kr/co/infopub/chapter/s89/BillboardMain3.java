package kr.co.infopub.chapter.s89;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class BillboardMain3 {
    public static void main(String[] args) {
        String newUrls = "https://www.billboard.com/charts/hot-100";
        URL url = null;

        try {
            url = new URL(newUrls);

            // 주소지에 빨대 꽂기
            // InputStreamReaer는 url에서 openStream으로 끄집어낸다
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(url.openStream(), "euc-kr"), 8);
//            System.out.print(reader.toString());
            String line = null;

            // reader inputStream으로부터 읽어들인 stream이 비어있지 않으면, 한줄씩 읽어서 데이터를 뿌려준다
            while ((line = reader.readLine()) != null) {
                if (!line.trim().equals("")) { // 공백이 아니면 출력한다
                    System.out.println(line.trim());
                }
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
