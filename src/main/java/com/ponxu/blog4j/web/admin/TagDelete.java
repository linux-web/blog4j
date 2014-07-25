package com.ponxu.blog4j.web.admin;

/**
 * 标签删除
 * 
 * @author wanggang
 *
 */
public class TagDelete extends AdminOAuthHandler {

	public void get(int id) {
		tagService.remove(id);
		renderString(String.valueOf(id));
	}

}