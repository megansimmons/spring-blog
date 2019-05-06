package com.codeup.blog;

public class Post {
    private String title;
    private String body;
    private String email;

    public Post(String title, String body, String email) {
        this.title = title;
        this.body = body;
        this.email = email;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
