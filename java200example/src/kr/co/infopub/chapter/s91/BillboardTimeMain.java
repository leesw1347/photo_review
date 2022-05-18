package kr.co.infopub.chapter.s91;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class BillboardTimeMain {
    public static void main(String[] args) {
        String newUrls = "https://www.billboard.com/charts/hot-100/";
        String s = "";
        URL url = null;

        try {
            url = new URL(newUrls);
            // 주소지에 빨대 꽂기
            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(url.openStream(), "euc-kr"), 8
            );
            String line = "";

            while ((line = bufferedReader.readLine()) != null) { // 한 줄씩 읽어들인다
                // 문자열이 있다면
                if (!line.trim().equals("")) {
                    // <time datetime='2018-08-13'> August 13, 2018</time>
                    if (line.trim().contains("00@mobile-max") && (line.trim().contains(">Week of May"))) { // 찾기
                        System.out.println(line.trim());
                        s = line.trim();
                        s = s.substring(0, s.indexOf("-max\">")); // <time datetime="2018-08-13
                        System.out.println(s);
                        s = s.substring(s.indexOf("\"") + 1).trim(); // 2018-08-13
                        break;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
