package kr.co.infopub.chapter.s169;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

public class FixerConvert {
    public static String conversion(String date, String base) throws MalformedURLException {
        BufferedReader bufferedReader = null;
        StringBuilder stringBuilder = new StringBuilder();
        String url = "https://data.fixer.io/api/latest?access_key=zXwD6ZT7XW7mcZhcy2ZSYGizgyrLLUPj";
//        Connection connection = Jsoup.newSession();
        URLConnection urlConnection = new URLConnection(new URL(url)) {
            @Override
            public void connect() throws IOException {
                this.setReadTimeout(1000);
                this.getContent();
            }

            @Override
            public Map<String, List<String>> getHeaderFields() {
                return super.getHeaderFields();
            }

            @Override
            public Object getContent() throws IOException {
                System.out.print(super.getContent());
                return super.getContent();

            }
        };

        try {
            urlConnection.connect();
//            System.out.println(MessageFormat.format("getHeaderFields {0}", urlConnection.getHeaderFields()));
//            OutputStreamWriter inputStream = urlConnection.getOutputStream();
            String msg = "";
            // data.fixer.io/api 데이터를 읽어들인다
//            byte[] readBytes = inputStream.readAllBytes();
//            System.out.print(readBytes);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) throws MalformedURLException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        String date = simpleDateFormat.format(calendar.getTime());
        String base = "USD";
        String fixerrate = FixerConvert.conversion(date, base);
        System.out.println(fixerrate);
    }
}
