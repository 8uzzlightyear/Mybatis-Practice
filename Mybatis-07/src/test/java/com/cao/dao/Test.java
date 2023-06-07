package com.cao.dao;

import com.cao.pojo.Teacher;
import com.cao.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

public class Test {
    SqlSession sqlSession = null;
    @org.junit.Test
    public void test() {
        sqlSession = MybatisUtils.getSqlSession();
        System.out.println(sqlSession.getMapper(TeacherMapper.class).getTeacher(1));
    }

}

