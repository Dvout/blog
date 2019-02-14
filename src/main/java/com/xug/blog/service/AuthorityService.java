package com.xug.blog.service;

import com.xug.blog.domain.Authority;

import java.util.Optional;

/**
* @Description: Authority
* @Author: Xugui
* @Date: 19-1-27
*/
public interface AuthorityService {

	/**
	 * 根据id查询权限
	 *
	 * @param id
	 * @return
	 */
	Optional<Authority> getAuthorityById(Long id);
}
