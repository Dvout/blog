package com.xug.blog.repository;

import com.xug.blog.domain.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

/** 
* @Description: AuthorityRepository
* @Author: Xugui
* @Date: 19-1-27 
*/ 
public interface AuthorityRepository extends JpaRepository<Authority, Long> {
}
