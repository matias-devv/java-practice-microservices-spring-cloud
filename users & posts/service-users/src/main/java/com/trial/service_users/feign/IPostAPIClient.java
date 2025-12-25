package com.trial.service_users.feign;

import com.trial.service_users.dto.PostDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="service-posts")
public interface IPostAPIClient {

    @GetMapping("/post/find/{user_id}")
    public List<PostDTO> findAllByUser(@PathVariable ("user_id") Long user_id);
}
