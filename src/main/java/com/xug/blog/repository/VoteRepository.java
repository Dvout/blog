package com.xug.blog.repository;

import com.xug.blog.domain.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

/** 
* @Description: VoteRepository
* @Author: Xugui
* @Date: 19-1-27 
*/ 
public interface VoteRepository extends JpaRepository<Vote, Long> {
}
