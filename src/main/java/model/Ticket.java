package model;

import com.google.gson.annotations.SerializedName;

/** Объект тикета (POJO) */
public class Ticket {

    // todo: serialized поля, геттеры и сеттеры

    @SerializedName("username")
private String username;

    @SerializedName("password")
    private String password;

    @SerializedName("title")
    private  String title;

    @SerializedName("slug")
    private String slug;

    @SerializedName("queue")
    private int queue;

    @SerializedName("query")
    private String query;

    public void setQuery(String query) {this.query = query;}
    public String getQuery() {
        return query;
    }

    public void setQueue(int queue) {
        this.queue = queue;
    }
    public int getQueue() {
        return queue;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return password;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    public String getSlug() {
        return slug;
    }
    public void setSlug(String slug) {
        this.slug = slug;
    }

    @Override
    public boolean equals(Object o) {
        // todo
        return false;
    }

    @Override
    public int hashCode() {
        // todo
        return 0;
    }
}