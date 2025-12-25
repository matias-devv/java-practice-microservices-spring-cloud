package com.trial.service_users.service;

import com.trial.service_users.dto.PostDTO;
import com.trial.service_users.feign.IPostAPIClient;
import com.trial.service_users.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {

    @Autowired
    private IUserRepository iUserRepository;

    @Autowired
    private IPostAPIClient iPostAPIClient;

    @Override
    public List<PostDTO> findAllByUser(Long user_id) {
        return iPostAPIClient.findAllByUser(user_id);
    }
}
