package edu.homework.web.bean;

import java.io.Serializable;

public class News implements Serializable {
    private String title;
    private String brief;

    public News(String title, String brief) {
        this.title = title;
        this.brief = brief;
    }

    public News() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        News news = (News) o;

        if (!title.equals(news.title)) return false;
        return brief.equals(news.brief);
    }

    @Override
    public int hashCode() {
        int result = title.hashCode();
        result = 31 * result + brief.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                ", brief='" + brief + '\'' +
                '}';
    }
}
