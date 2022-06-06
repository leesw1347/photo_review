package Chapter7.Part1;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class WikiFetcher {
    /**
     * jsoup을 이용해서 위키피디아 페이지를 다운로드 하는 유틸리티 클래스를 그대로 보유하고 있다.
     */

    private long lastRequestTime = -1;
    private long minInterval = 1000;

    private WikiFetcher wikiFetcher = null;

    public WikiFetcher(WikiFetcher wikiFetcher) {
        this.wikiFetcher = wikiFetcher;
    }

    /**
     * URL을 파싱하고 본문을 가져옵니다
     * 단락 요소의 리스트를 반환합니다
     */
    public Elements fetchWikipedia(String url) throws IOException {
        sleepIfNeeded();
        if (url == null) {
            return null;
        }
        Connection connection = Jsoup.connect(url);
        Document document = connection.get();
        Element content = document.getElementById("mw-content-text");
        Elements elements = content.select("p");
        return elements;
    }

    private void sleepIfNeeded() {
        if (lastRequestTime != -1) {
            long currentTime = System.currentTimeMillis();
            long nextRequestTime = lastRequestTime + minInterval; // 이전 작업 시간 대비 1초 차이로 시간텀이 있으면, 1초간 작업을 쉽니다
            if (currentTime < nextRequestTime) {
                try {
                    Thread.sleep(nextRequestTime - currentTime);
                } catch (InterruptedException e) {
                    System.err.println(
                            "Warning: sleep interruped in fetchWikipedia"
                    );
                }
            }
            lastRequestTime = System.currentTimeMillis();
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) throws IOException {
        WikiFetcher wikiFetcher = new WikiFetcher(null);
        String url = "https://en.wikipedia.org/wiki/Java_(programming_language)";
        Elements paragraphs = wikiFetcher.fetchWikipedia(url);
        for (Element paragraph : paragraphs) {
            System.out.println(paragraph);
        }
    }
}
