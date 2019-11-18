package com.xcz.doudou.user.service;

import com.xcz.doudou.user.pojo.UmsMember;

import java.util.List;

public interface UserService {
    /**
     * 获得所有用户信息
     * @return
     */
    List<UmsMember> getAllUser();
}
