package com.trial.services_posts.repository;

import com.trial.services_posts.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPostRepository extends JpaRepository<Post, Long> {

    @Query("SELECT p FROM Post p WHERE p.user_id = :user_id")
    List<Post> findAllByUser(@Param("user_id") Long user_id);
}
