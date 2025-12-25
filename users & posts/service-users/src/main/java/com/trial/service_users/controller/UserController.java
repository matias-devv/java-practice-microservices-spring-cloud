package com.trial.service_users.controller;

import com.trial.service_users.dto.PostDTO;
import com.trial.service_users.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService iUserService;

    @GetMapping("/find/{user_id}")
    public List<PostDTO> findAllPostsByUser(@PathVariable("user_id") Long user_id){
        return iUserService.findAllByUser(user_id);
    }
}
