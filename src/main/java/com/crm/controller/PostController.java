package com.crm.controller;

import com.crm.entity.Post;
import com.crm.service.PostService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/posts")
public class PostController {
   private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping
    public String createPost(
            @RequestBody Post post
    ){
        postService.createPost(post);
        return "created";
    }

    @DeleteMapping
    public void deletePost(){
        postService.deletePost();
    }
}
