package com.cao.dao;

import com.cao.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    //使用注解实现接口方法，无法在配置文件中解决结果映射问题，可以在实体类中添加设置属性，如在User类添加setPwd方法。
    @Select("select * from user")
    List<User> getUserList();
    //通过xml文件实现
    User getUserById(int i);
    int insertUser(User user);
    int updateUser(User user);
    int deleteUser(int id);

}
