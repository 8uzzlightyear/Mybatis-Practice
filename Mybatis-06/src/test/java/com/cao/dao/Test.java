package com.cao.dao;

import com.cao.pojo.Student;
import com.cao.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

public class Test {
    SqlSession sqlSession = null;
    @org.junit.Test
    public void test() {
        sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        for (Student student : mapper.getStudent()) {
            System.out.println(student);
        }

    }

}
