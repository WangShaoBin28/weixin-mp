package com.app.dao;

import com.app.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Package com.app.dao
 * @ClassName UserDao
 * @Author shaobin.wang
 * @Date 2019/01/03 18:56
 * @Version 1.0
 * @Description:
 **/
@Mapper
public interface UserDao {

    List<User> selectAll();
}
