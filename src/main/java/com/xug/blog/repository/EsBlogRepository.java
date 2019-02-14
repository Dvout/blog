package com.xug.blog.repository;

import com.xug.blog.domain.EsBlog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/** 
* @Description: EsBlogRepository
* @Author: Xugui
* @Date: 19-1-27 
*/ 
public interface EsBlogRepository extends ElasticsearchRepository<EsBlog, String> {
	/**
	 * 模糊查询(去重)
	 *
	 * @param title
	 * @param summary
	 * @param content
	 * @param tags
	 * @param pageable
	 * @return
	 */
	Page<EsBlog> findByTitleContainingOrSummaryContainingOrContentContainingOrTagsContaining(
			String title, String summary, String content, String tags, Pageable pageable);

	/**
	 * 根据 Blog 的id 查询 EsBlog
	 *
	 * @param blogId
	 * @return
	 */
	EsBlog findByBlogId(Long blogId);
}
