package com.cao.dao;

import com.cao.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import com.cao.pojo.Blog;
import com.cao.utils.IDUtils;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Test {
    SqlSession sqlSession = null;
    @org.junit.Test
    public void test() {
        sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map map = new HashMap();
        //map.put("title", "Spring");
        map.put("author", "狂神说");
        System.out.println(mapper.queryBlogIF(map));
    }

}

