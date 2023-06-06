package com.cao.dao;

import com.cao.pojo.User;
import com.cao.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDaoTest {
    static Logger Logger = org.apache.log4j.Logger.getLogger(UserDaoTest.class);
    @Test
    public void test() {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtils.getSqlSession();
            Logger.info("获得sqlSession");
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User user1 = userMapper.getUserById(1);

            System.out.println(user1);
        } finally {
            sqlSession.close();
        }
    }
}
