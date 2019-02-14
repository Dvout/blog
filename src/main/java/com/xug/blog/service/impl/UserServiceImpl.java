package com.xug.blog.service.impl;

import com.xug.blog.repository.UserRepository;
import com.xug.blog.domain.User;
import com.xug.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

/** 
* @Description: 用户服务实现类
* @Author: Xugui
* @Date: 19-1-27 
*/ 
@Service(value = "userService")
public class UserServiceImpl implements UserService, UserDetailsService {

	@Autowired
	private UserRepository repository;

	@Transactional
	@Override
	public User saveOrUpdateUser(User user) {
		return repository.save(user);
	}

	@Transactional
	@Override
	public User registerUser(User user) {
		return repository.save(user);
	}

	@Transactional
	@Override
	public void removeUser(Long id) {
		repository.deleteById(id);
	}

	@Override
	public Optional<User> getUserById(Long id) {
		return repository.findById(id);
	}

	@Override
	public Page<User> listUsersByNameLike(String name, Pageable pageable) {
		name = "%" + name + "%";
		return repository.findByNameLike(name, pageable);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return repository.findByUsername(username);
	}

	@Override
	public List<User> listUsersByUsernames(Collection<String> usernames) {
		return repository.findByUsernameIn(usernames);
	}
}
