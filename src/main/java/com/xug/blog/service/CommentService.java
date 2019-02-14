package com.xug.blog.service;

import com.xug.blog.domain.Comment;

import java.util.Optional;

/**
* @Description: CommentService
* @Author: Xugui
* @Date: 19-1-27
*/
public interface CommentService {

	/**
	 * 根据id获取comment
	 *
	 * @param id
	 * @return
	 */
	Optional<Comment> getCommentById(Long id);

	/**
	 * 删除评论
	 *
	 * @param id
	 */
	void removeComment(Long id);
}
