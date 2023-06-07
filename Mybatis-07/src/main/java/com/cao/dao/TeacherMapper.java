package com.cao.dao;

import com.cao.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherMapper {
    public List<Teacher> getTeacher();

    public Teacher getTeacher(@Param("tid") int id);
    public Teacher getTeacher2(@Param("tid") int id);
}
