package com.dfrz.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.dfrz.pojo.User;
import com.dfrz.mapper.UserMapper;
import com.dfrz.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Wrapper;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 老王
 * @since 2023-02-15
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;

    @Override
    public User doLogin(User user) {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("user_account",user.getUserAccount());
        wrapper.eq("user_pwd",user.getUserPwd());
        return userMapper.selectOne(wrapper);
    }

    @Override
    public List<User> getAllUser(User user) {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.like("user_account",user.getUserAccount());
        return userMapper.selectList(wrapper);
    }

}
