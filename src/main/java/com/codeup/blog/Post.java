package com.codeup.blog;


import com.codeup.blog.models.User;

import javax.persistence.*;

@Entity @Table(name = "posts")
public class Post {
    //creating table
    @Id @GeneratedValue
    private Long id;

    @Column(nullable = false,length = 100)
    private String title;

    @Column(nullable = false)
    private String body;


    @OneToOne
    private User user;



//getters and setters

    public Post(){

    }

    public Post(long id) {
        this.id = id;
    }

    public Post(String title, String body, User user) {
        this.title = title;
        this.body = body;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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


    public User getUser(){
        return user;
    }

    public void setUser(User user){
        this.user = user;
    }


}

