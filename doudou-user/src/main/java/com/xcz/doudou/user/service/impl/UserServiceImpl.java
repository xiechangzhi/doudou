package com.xcz.doudou.user.service.impl;

import com.xcz.doudou.user.mapper.UserMapper;
import com.xcz.doudou.user.pojo.UmsMember;
import com.xcz.doudou.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> userMembers = userMapper.selectAllUser();
        return userMembers;
    }
}
