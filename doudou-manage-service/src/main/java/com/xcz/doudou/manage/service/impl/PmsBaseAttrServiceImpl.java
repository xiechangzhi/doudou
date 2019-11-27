package com.xcz.doudou.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.xcz.doudou.manage.mapper.PmsBaseAttrInfoMapper;
import com.xcz.doudou.manage.mapper.PmsBaseAttrValueMapper;
import com.xcz.doudou.pojo.PmsBaseAttrInfo;
import com.xcz.doudou.service.PmsBaseAttrService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class PmsBaseAttrServiceImpl implements PmsBaseAttrService {

    @Autowired
    PmsBaseAttrInfoMapper pmsBaseAttrInfoMapper;

    @Autowired
    PmsBaseAttrValueMapper pmsBaseAttrValueMapper;

    @Override
    public List<PmsBaseAttrInfo> attrInfoList(String catalog3Id) {

        PmsBaseAttrInfo pmsBaseAttrInfo=new PmsBaseAttrInfo();
        pmsBaseAttrInfo.setCatalog3Id(catalog3Id);
        List<PmsBaseAttrInfo> pmsBaseAttrInfos = pmsBaseAttrInfoMapper.select(pmsBaseAttrInfo);
        return pmsBaseAttrInfos;

    }
}
