package com.xcz.doudou.service;

import com.xcz.doudou.pojo.UmsMember;
import com.xcz.doudou.pojo.UmsMemberReceiveAddress;

import java.util.List;

public interface UmsMemberService {
    /**
     * 获得所有用户信息
     * @return
     */
    List<UmsMember> getAllUser();

    /**
     * 根据用户id查询用户地址
     * @return
     */
    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
