package com.springboot.blogApp.repository;

import com.springboot.blogApp.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {

}
