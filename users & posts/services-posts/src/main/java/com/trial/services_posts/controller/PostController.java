package com.trial.services_posts.controller;

import com.trial.services_posts.dto.PostDTO;
import com.trial.services_posts.service.IPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {

    @Autowired
    private IPostService iPostService;

    @Value("${server.port}")
    private int port;

    @GetMapping("/find/{user_id}")
    public List<PostDTO> findAllByUser(@PathVariable("user_id") Long user_id){
        System.out.println("Right now I'm in the server port: " + port);
        return iPostService.findAllByUser(user_id);
    }
}
