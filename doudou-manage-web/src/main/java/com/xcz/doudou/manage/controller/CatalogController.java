package com.xcz.doudou.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xcz.doudou.pojo.PmsBaseAttrInfo;
import com.xcz.doudou.pojo.PmsBaseCatalog1;
import com.xcz.doudou.pojo.PmsBaseCatalog2;
import com.xcz.doudou.pojo.PmsBaseCatalog3;
import com.xcz.doudou.service.CatalogService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@CrossOrigin
public class CatalogController {

    @Reference
    CatalogService catalogService;

    @ResponseBody
    @RequestMapping("getCatalog3")
    public List<PmsBaseCatalog3> getCatalog3(String catalog2Id){
        List<PmsBaseCatalog3> pmsBaseCatalog3s=catalogService.getCatalog3(catalog2Id);
        return pmsBaseCatalog3s;
    }

    @ResponseBody
    @RequestMapping("getCatalog2")
    public List<PmsBaseCatalog2> getCatalog2(String catalog1Id){
        List<PmsBaseCatalog2> pmsBaseCatalog2s=catalogService.getCatalog2(catalog1Id);
        return pmsBaseCatalog2s;
    }

    @ResponseBody
    @RequestMapping("getCatalog1")
    public List<PmsBaseCatalog1> getCatalog1(){
        List<PmsBaseCatalog1> pmsBaseCatalog1s=catalogService.getCatalog1();
        return pmsBaseCatalog1s;
    }
}
