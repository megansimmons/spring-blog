package com.codeup.blog.controllers;

import com.codeup.blog.EmailService;
import com.codeup.blog.Post;
import com.codeup.blog.repositories.PostRepository;
import com.codeup.blog.repositories.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {


    private final PostRepository postDao;
    private final UserRepository userDao;
    private EmailService emailService;

    //constructor
    public PostController(PostRepository postDao, UserRepository userDao, EmailService emailService){

        this.postDao = postDao;
        this.userDao = userDao;
        this.emailService = emailService;

    }

    //    shows all the posts in the table
    @GetMapping("/posts")
    public String index(Model vmodel){

        vmodel.addAttribute("post", postDao.findAll());
        return "posts/index";
    }



    @GetMapping("/posts/{id}")
    public String showpost(@PathVariable Long id, Model vmodel){
        Post post = postDao.findOne(id);
        vmodel.addAttribute("post",post);
        return "posts/show";
    }

    @GetMapping("/posts/create")
    public String showcreateform(Model model){

        model.addAttribute("post", new Post());
        return "posts/create";
    }

    @PostMapping("/posts/create")
    public String createPost(@ModelAttribute Post post){

        post.setUser(userDao.findOne(1L));
        postDao.save(post);
        emailService.prepareAndSend(post,"hello", "working" );
        return "redirect:/posts";
    }


    @GetMapping("/posts/{id}/edit")
    public String editform(@PathVariable Long id ,Model vmodel){
        vmodel.addAttribute("post",postDao.findOne(id));
        return "posts/edit";
    }


    @PostMapping("/posts/{id}/edit")

    public String editpost(@ModelAttribute Post postToBeEdited){
        postToBeEdited.setUser(userDao.findOne(1L));
        Post postEdited = postDao.save(postToBeEdited);
        return "redirect:/posts";

    }


    @GetMapping("/posts/{id}/delete")
    public String deleteform(@PathVariable Long id,Model vmodel){

        Post post = postDao.findOne(id);
        vmodel.addAttribute("post",post);
        return ("posts/delete");
    }

    @PostMapping("/posts/{id}/delete")

    public String deletePost(@PathVariable Long id){
        postDao.delete(id);

        return "redirect:/posts";
    }




}
