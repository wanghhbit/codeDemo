package com.boot.demo.service;

import com.boot.demo.entity.User;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Author: Administrator
 * Date: 2018/12/27 0027 下午 3:59
 * version: 1.0.0
 * description:
 */
public interface UserService {

    int addUser(User user);

    List<User> findAllUser(int pageNum, int pageSize);

}
