package com.xcz.doudou.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xcz.doudou.pojo.UmsMember;
import com.xcz.doudou.pojo.UmsMemberReceiveAddress;
import com.xcz.doudou.service.UmsMemberService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UmsMemberController {

    @Reference
    UmsMemberService umsMemberService;

    @RequestMapping("getReceiveAddressByMemberId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId){
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses=umsMemberService.getReceiveAddressByMemberId(memberId);
        return umsMemberReceiveAddresses;
    }

    @RequestMapping("getAllUmsMember")
    @ResponseBody
    public List<UmsMember> getAllUmsMember(){
        List<UmsMember> umsMemberMembers=umsMemberService.getAllUmsMember();
        return umsMemberMembers;
    }
}
