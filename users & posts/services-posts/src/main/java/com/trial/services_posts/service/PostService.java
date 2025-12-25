package com.trial.services_posts.service;

import com.trial.services_posts.dto.PostDTO;
import com.trial.services_posts.model.Post;
import com.trial.services_posts.repository.IPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService implements IPostService {

    @Autowired
    private IPostRepository iPostRepository;

    @Override
    public List<PostDTO> findAllByUser(Long id_user) {

        List<Post> listPosts = iPostRepository.findAllByUser(id_user);
        List<PostDTO> listDTOs = new ArrayList<>();

        for (Post post : listPosts) {

            PostDTO dto = new PostDTO();
            dto.setId(post.getId());
            dto.setTitle(post.getTitle());
            dto.setUser_id(post.getUser_id());
            listDTOs.add(dto);
        }
        return listDTOs;
    }
}
