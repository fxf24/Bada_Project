package com.example.qudqj_000.a2017_10_30;

/**
 * Created by qudqj_000 on 2017-10-30.
 */

public class News_Data {
    private int news_img;
    private String news_title;
    private String news_html;

    public News_Data(int news_img, String news_title, String news_html){
        this.news_img = news_img;
        this.news_title = news_title;
        this.news_html = news_html;
    }
    public int getNews_img() {
        return news_img;
    }

    public void setNews_img(int news_img) {
        this.news_img = news_img;
    }

    public String getNews_title() {
        return news_title;
    }

    public void setNews_title(String news_title) {
        this.news_title = news_title;
    }

    public String getNews_html() {
        return news_html;
    }

    public void setNews_html(String news_html) {
        this.news_html = news_html;
    }
}
