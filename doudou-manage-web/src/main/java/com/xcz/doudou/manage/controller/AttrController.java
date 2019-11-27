package com.xcz.doudou.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xcz.doudou.pojo.PmsBaseAttrInfo;
import com.xcz.doudou.service.PmsBaseAttrInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
public class AttrController {

    @Reference
    PmsBaseAttrInfoService pmsBaseAttrInfoService;

    @ResponseBody
    @RequestMapping("attrInfoList")
    public List<PmsBaseAttrInfo> attrInfoList(String catalog3Id){
        List<PmsBaseAttrInfo> pmsBaseAttrInfos=pmsBaseAttrInfoService.attrInfoList(catalog3Id);
        return pmsBaseAttrInfos;
    }
}
