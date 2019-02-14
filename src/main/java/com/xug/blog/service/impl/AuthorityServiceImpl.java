package com.xug.blog.service.impl;

import com.xug.blog.repository.AuthorityRepository;
import com.xug.blog.domain.Authority;
import com.xug.blog.service.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/** 
* @Description: 权限服务实现类
* @Author: Xugui
* @Date: 19-1-27 
*/ 
@Service
public class AuthorityServiceImpl implements AuthorityService {

	@Autowired
	private AuthorityRepository repository;

	@Override
	public Optional<Authority> getAuthorityById(Long id) {
		return repository.findById(id);
	}
}
