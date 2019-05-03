package com.codeup.blog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PostController {

    @GetMapping("/posts")
    public String viewAllPosts(Model vModel){

        Post postOne = new Post("Pancakes", "Do you like bluebs in your pancakes?");
        Post postTwo = new Post("Tacos", "I end up getting tacos instead of pancakes every time I have to choose.");
        Post postThree = new Post("Other", "Ever had the Honey Butter Chicken Biscuit from Whataburger?  I highly recommend it. It is so choice. (Last sentence from Ferris Bueller's Day Off)");

        List<Post> post = new ArrayList<>();

        post.add(postOne);
        post.add(postTwo);
        post.add(postThree);

        vModel.addAttribute("posts", post);

        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String viewPostById(@PathVariable long id, Model vmodel){

        Post post = new Post("Breakfast anyone?", "They say lots of things about breakfast. I say it rocks.");
        vmodel.addAttribute("post", post);
        vmodel.addAttribute("postId", id);
        return "posts/show";
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String showCreatePostForm(){
        return "View the form for creating a new post.";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String createPost(){
        return "Create a new post.";
    }


}
