package com.xug.blog.repository;

import com.xug.blog.domain.Catalog;
import com.xug.blog.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/** 
* @Description: CatalogRepository
* @Author: Xugui
* @Date: 19-1-27 
*/ 
public interface CatalogRepository extends JpaRepository<Catalog, Long> {

	/**
	 * 根据用户查询
	 *
	 * @param user
	 * @return
	 */
	List<Catalog> findByUser(User user);

	/**
	 * 根据用户查询
	 *
	 * @param user
	 * @param name
	 * @return
	 */
	List<Catalog> findByUserAndName(User user, String name);
}
