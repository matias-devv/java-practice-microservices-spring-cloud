package com.trial.service_users.service;

import com.trial.service_users.dto.PostDTO;

import java.util.List;

public interface IUserService {

    public List<PostDTO> findAllByUser(Long user_id);
}
