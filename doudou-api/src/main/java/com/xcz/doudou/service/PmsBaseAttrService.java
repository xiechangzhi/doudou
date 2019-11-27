package com.xcz.doudou.service;

import com.xcz.doudou.pojo.PmsBaseAttrInfo;

import java.util.List;

public interface PmsBaseAttrService {
    /**
     * 根据三级目录查询平台属性
     * @param catalog3Id
     * @return
     */
    List<PmsBaseAttrInfo> attrInfoList(String catalog3Id);

}
