package com.meohin.domain.post.post.repository;

import com.meohin.domain.post.post.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PostRepository extends JpaRepository<Post, Integer> {
    Optional<Post> findFirstByOrderByIdDesc();
}