package com.xug.blog.service.impl;

import com.xug.blog.repository.VoteRepository;
import com.xug.blog.domain.Vote;
import com.xug.blog.service.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/** 
* @Description: VoteServiceImpl
* @Author: Xugui
* @Date: 19-1-27 
*/ 
@Service
public class VoteServiceImpl implements VoteService {

	@Autowired
	private VoteRepository repository;

	@Override
	public Optional<Vote> getVoteById(Long id) {
		return repository.findById(id);
	}

	@Override
	public void removeVote(Long id) {
		repository.deleteById(id);
	}
}
