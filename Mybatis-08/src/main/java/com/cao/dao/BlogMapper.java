package com.cao.dao;

import com.cao.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {
    int addBlog(Blog blog);
    List<Blog> queryBlogIF(Map map);
}
