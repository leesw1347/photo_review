package kr.co.infopub.chapter.s93;

import kr.co.infopub.chapter.s083.Billboard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class RequestFromBilboardHot {
    ArrayList<String> htmls = new ArrayList<>();
    ArrayList<Billboard> billboards = new ArrayList<>();

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
            url = new URL(newUrls);
            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(url.openStream(), "euc-kr"), 8
            );

            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                if (!line.trim().equals("")) {
                    htmls.add(line.trim());
                }
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
