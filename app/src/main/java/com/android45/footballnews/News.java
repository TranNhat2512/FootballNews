package com.android45.footballnews;

public class News {
    public int image;
    public String title;
    public String link;
    public String description;

    public News(int image, String title, String link, String description) {
        this.title = title;
        this.link = link;
        this.description = description;
        this.image = image;
    }
}
