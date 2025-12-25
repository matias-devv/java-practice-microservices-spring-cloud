package com.trial.services_posts.service;

import com.trial.services_posts.dto.PostDTO;

import java.util.List;

public interface IPostService {

    public List<PostDTO> findAllByUser(Long id_user);
}
