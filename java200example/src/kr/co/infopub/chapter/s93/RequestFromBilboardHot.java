package kr.co.infopub.chapter.s93;

import kr.co.infopub.chapter.s083.Billboard;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.regex.Pattern;

public class RequestFromBilboardHot {
    ArrayList<String> htmls = new ArrayList<>();
    ArrayList<Billboard> billboards = new ArrayList<>();
    Connection jsoup = Jsoup.newSession();
    boolean isConnection = false;

    public RequestFromBilboardHot(ArrayList<String> htmls, ArrayList<Billboard> billboards, boolean isConnection) {
        this.htmls = htmls;
        this.billboards = billboards;
        this.isConnection = isConnection;
    }

    public RequestFromBilboardHot() {
        htmls.clear();
        billboards.clear();
    }

    public ArrayList<Billboard> getBillboards() {
        return billboards;
    }

    public void getAllHtml(String newUrls) {
        htmls.clear();
        URL url = null;
        try {
            Document doucment = jsoup.url(newUrls).get();
            Elements elements = doucment.select("div.o-chart-results-list-row-container");
            Iterator<Element> elementIterator = elements.stream().iterator();
//            System.out.println(elements);

            while (elementIterator.hasNext()) {
                String rank = "";
                String song = "";
                String imgsrc = "";
                String lastweek = "";

                Element element = elementIterator.next();
                Elements elements1 = element.tagName("ul").getElementsByTag("li");

                // 랭킹정보
                rank = elements1.get(0).getElementsByTag("span").text().trim();

                // 이미지 정보
                imgsrc = elements1.get(1).selectFirst("div.c-lazy-image")
                        .selectFirst("img.c-lazy-image__img").attr("data-lazy-src").trim();

                song = elements1.get(3)
                        .selectFirst("ul.lrv-a-unstyle-list")
                        .getElementsByTag("li")
                        .text().trim();

                try {
                    for (Element ul_element : elements.get(3)
                            .select("ul")) {
                        lastweek = ul_element.getElementsByTag("li").get(3).tagName("span").text().trim();
                    }
                } catch (IndexOutOfBoundsException ex) {
                    ex.printStackTrace();
                }

                // 새로운 빌보드 객체를 생성해서,
                Billboard billboard = new Billboard(
                        rank, song, lastweek, imgsrc, ""
                );
                System.out.println(billboard);
            }

            isConnection = true; // 연결에 성공했으면 isConnection 변수를 true로 설정해준다

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            isConnection = false;
            e.printStackTrace();
        }
    }

    public String getTimeDate(String newUrls) {
        String s = "";
        URL url = null;
        try {
            Document document = jsoup.url(newUrls).get();
            Elements elements = document.select("p.c-tagline.a-font-primary-medium-xs");
//            System.out.println(elements);
            Iterator<Element> documentIterator = elements.stream().iterator();
            while (documentIterator.hasNext()) {
                Element element = documentIterator.next();
                if (element.hasText() && (element.text().length() > 0)) {
                    // element 객체에서 text를 뽑아서 표현한다
                    s = element.text().trim();
                    break;
                }
            }
            isConnection = true;

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return s;
    }

    public synchronized void getBillboardData(String msg) {
        billboards.clear();
        for (int i = 0; i < htmls.size(); i++) {
            String ss = htmls.get(i);
            if (ss.contains(msg)) {
                String rank = ss.substring(ss.indexOf("chart-row--"));
            }
        }
    }

    public static void main(String[] args) {
        RequestFromBilboardHot requestFromBilboardHot = new RequestFromBilboardHot();
        String a = "https://www.billboard.com/charts/hot-100";
        String rs = requestFromBilboardHot.getTimeDate(a);
        System.out.println(MessageFormat.format("시간데이터는 {0}", rs.toString()));

        requestFromBilboardHot.getAllHtml(a);
        System.out.println(rs);
//        requestFromBilboardHot.getBillboardData("o-chart-results-list-row-container");
    }
}
