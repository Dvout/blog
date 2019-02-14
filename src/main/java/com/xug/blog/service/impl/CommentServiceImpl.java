package com.xug.blog.service.impl;

import com.xug.blog.repository.CommentRepository;
import com.xug.blog.domain.Comment;
import com.xug.blog.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/** 
* @Description: CommentServiceImpl
* @Author: Xugui
* @Date: 19-1-27 
*/ 
@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	private CommentRepository repository;

	@Override
	public Optional<Comment> getCommentById(Long id) {
		return repository.findById(id);
	}

	@Override
	public void removeComment(Long id) {
		repository.deleteById(id);
	}
}
