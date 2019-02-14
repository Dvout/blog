package com.xug.blog.service;

import com.xug.blog.domain.Vote;

import java.util.Optional;

/** 
* @Description: VoteService
* @Author: Xugui
* @Date: 19-1-27 
*/ 
public interface VoteService {

	/**
	 * 根据id获取vote
	 *
	 * @param id
	 * @return
	 */
	Optional<Vote> getVoteById(Long id);

	/**
	 * 根据id删除vote
	 *
	 * @param id
	 */
	void removeVote(Long id);
}
