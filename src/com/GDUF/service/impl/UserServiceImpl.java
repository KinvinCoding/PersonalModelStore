package com.GDUF.service.impl;

import com.GDUF.base.BaseDao;
import com.GDUF.base.BaseServiceImpl;
import com.GDUF.mapper.UserMapper;
import com.GDUF.po.User;
import com.GDUF.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public BaseDao<User> getBaseDao() {
        return userMapper;
    }
}
