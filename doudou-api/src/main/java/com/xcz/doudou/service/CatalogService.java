package com.xcz.doudou.service;

import com.xcz.doudou.pojo.PmsBaseCatalog1;
import com.xcz.doudou.pojo.PmsBaseCatalog2;
import com.xcz.doudou.pojo.PmsBaseCatalog3;

import java.util.List;

public interface CatalogService {
    /**
     * 查询一级分类
     * @return
     */
    List<PmsBaseCatalog1> getCatalog1();

    /**
     * 查询二级分类
     * @param catalog1Id
     * @return
     */
    List<PmsBaseCatalog2> getCatalog2(String catalog1Id);

    /**
     * 查询三级分类
     * @param catalog2Id
     * @return
     */
    List<PmsBaseCatalog3> getCatalog3(String catalog2Id);
}
