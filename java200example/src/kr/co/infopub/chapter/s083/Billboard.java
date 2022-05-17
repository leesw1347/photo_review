package kr.co.infopub.chapter.s083;

import java.io.Serializable;
import java.text.MessageFormat;

/**
 * 5개의 데이터를 5번 전달하는것보다, 빌보드 차트 순위에 따라 곡의 정보와 관련된
 * 객체를 사용하면 좀 더 편하게 작업이 가능하다
 */
public class Billboard implements Serializable {
    private int rank;       // 순위
    private String song;    // 곡명
    private int lastweek;   // 전 주 순위
    private String imagesrc;    // 가수 사진
    private String artistsrc;   // 가수 정보
    private String artist;      // 가수 이름

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Billboard(int rank, String song, int lastweek, String imagesrc, String artistsrc, String artist) {
        this.rank = rank;
        this.song = song;
        this.lastweek = lastweek;
        this.imagesrc = imagesrc;
        this.artistsrc = artistsrc;
        this.artist = artist;
    }

    public Billboard(int rank, String song, int lastweek, String imagesrc, String artist) {
        this.rank = rank;
        this.song = song;
        this.lastweek = lastweek;
        this.imagesrc = imagesrc;
        this.artist = artist;
    }

    @Override
    public String toString() {
        return MessageFormat.format(
                "[rank={0}, song={1}, lastweek={2}," +
                        "imagesrc={3}, artist={4}"
                , rank
                , song
                , lastweek
                , imagesrc
                , artist
        ).toString();
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public int getLastweek() {
        return lastweek;
    }

    public void setLastweek(int lastweek) {
        this.lastweek = lastweek;
    }

    public String getImagesrc() {
        return imagesrc;
    }

    public void setImagesrc(String imagesrc) {
        this.imagesrc = imagesrc;
    }

    public String getArtistsrc() {
        return artistsrc;
    }

    public void setArtistsrc(String artistsrc) {
        this.artistsrc = artistsrc;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

}
