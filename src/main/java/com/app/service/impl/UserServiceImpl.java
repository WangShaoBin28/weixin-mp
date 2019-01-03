package com.app.service.impl;

import com.app.dao.UserDao;
import com.app.entity.User;
import com.app.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Package com.app.service
 * @ClassName UserService
 * @Author shaobin.wang
 * @Date 2019/01/03 19:00
 * @Version 1.0
 * @Description:
 **/
@Service
@Slf4j
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> list() {
        return userDao.selectAll();
    }
}
