package com.codeup.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

    @GetMapping("/posts")
    @ResponseBody
    public String allPosts(){
        return "All posts will show on this page.";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String postById(@PathVariable long id){
        return "View an individual post selected by id: " + id + ".";
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String showCreatePost(){
        return "View the form for creating a new post.";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String createPost(){
        return "Create a new post.";
    }


}
