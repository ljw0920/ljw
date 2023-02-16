package com.dfrz.service;

import com.dfrz.pojo.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 老王
 * @since 2023-02-15
 */
public interface UserService{
    User doLogin(User user);
    List<User> getAllUser(User user);
}
