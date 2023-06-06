package com.cao.pojo;

import lombok.Data;
@Data
public class User {
    private int id;
    private String name;
    private String password;
    public User() {
    }
    public User(int id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.password = pwd;
    }

    //为User类添加与数据库列字段相同名称的set方法也可以解决查询数据库时的结果集映射问题
    public void setPwd(String pwd) {
        this.password = pwd;
    }


}
