package kr.co.infopub.chapter.s168;

public class FixerRate {
    public String base;
    public String date;
    public double usd;
    public double jpy;
    public double krw;
    public double cny;
    public double eur;

    @Override
    public String toString() {
        return "FixRate[base= " + base + ", date= " + date + "," +
                "usd=" + usd + ",jpy=" + jpy + ",krw=" + krw + ",cny=" + cny
                + ",eur=" + eur;
    }
}
