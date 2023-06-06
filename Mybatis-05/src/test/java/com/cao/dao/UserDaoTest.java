package com.cao.dao;

import com.cao.pojo.User;
import com.cao.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDaoTest {
    @Test
    public void test() {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtils.getSqlSession();
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<User> userList = userMapper.getUserList();
            User user1 = userMapper.getUserById(1);

            for (User user : userList) {
                System.out.println(user);
            }
            System.out.println(user1);
        } finally {
            sqlSession.close();
        }
    }
}
