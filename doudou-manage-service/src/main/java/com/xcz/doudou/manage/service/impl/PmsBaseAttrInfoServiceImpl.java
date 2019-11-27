package com.xcz.doudou.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.xcz.doudou.manage.mapper.PmsBaseAttrInfoMapper;
import com.xcz.doudou.pojo.PmsBaseAttrInfo;
import com.xcz.doudou.service.PmsBaseAttrInfoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class PmsBaseAttrInfoServiceImpl implements PmsBaseAttrInfoService {

    @Autowired
    PmsBaseAttrInfoMapper pmsBaseAttrInfoMapper;

    @Override
    public List<PmsBaseAttrInfo> attrInfoList(String catalog3Id) {

        PmsBaseAttrInfo pmsBaseAttrInfo=new PmsBaseAttrInfo();
        pmsBaseAttrInfo.setCatalog3Id(catalog3Id);
        List<PmsBaseAttrInfo> pmsBaseAttrInfos = pmsBaseAttrInfoMapper.select(pmsBaseAttrInfo);
        return pmsBaseAttrInfos;
    }
}
