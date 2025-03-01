package com.crm.controller;

import com.crm.entity.Comment;
import com.crm.service.CommentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/comments")
public class CommentController {
    private CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @PostMapping
    public String createComment(
            @RequestBody Comment comment,
            @RequestParam long postId
    ){
        System.out.println(1000);
        System.out.println(1000);
        commentService.createComment(comment,postId);
        return "create comment";
    }
}
