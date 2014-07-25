package com.ponxu.blog4j.web.admin;

/**
 * 文章删除
 * 
 * @author wanggang
 *
 */
public class PostDelete extends AdminOAuthHandler {

	public void get(int id) {
		int i = postService.remove(id);
		renderString(String.valueOf(i));
	}

}