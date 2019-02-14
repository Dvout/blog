package com.xug.blog.repository;

import com.xug.blog.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

/** 
* @Description: CommentRepository
* @Author: Xugui
* @Date: 19-1-27 
*/ 
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
