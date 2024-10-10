package com.msh.qiye.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.msh.qiye.pojo.Report;
import com.msh.qiye.pojo.SaleChance;
import com.msh.qiye.service.SaleChanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author msh
 * @since 2024-09-19
 */
@CrossOrigin
@RestController
@RequestMapping("/saleChance")
public class SaleChanceController {

    @Autowired
    SaleChanceService saleChanceService;

//    @RequestMapping("/saleList")
//    public Map<String,Object> getSaleList(){
//        List<SaleChance> saleList=saleChanceService.getSaleList();
//
//        HashMap<String,Object> map=new HashMap<>();
//
//        map.put("code",0);
//        map.put("msg","成功查询");
//        map.put("data",saleList);
//
//        return map;
//    }

    @RequestMapping("/salePageList")
    public Map<String, Object> getSalePageList(Integer currentPage, Integer limitNum) {
        IPage<SaleChance> salePageList = saleChanceService.getSalePageData(currentPage, limitNum);

        HashMap<String, Object> map = new HashMap<>();

        map.put("code", 0);
        map.put("msg", "成功查询");
        map.put("data", salePageList.getRecords());
        map.put("total", salePageList.getTotal());
        return map;
    }

    @RequestMapping("/deleteSaleChance")
    public Map<String, Object> deleteSaleChance(SaleChance saleChance) {
        Boolean flag = saleChanceService.deletSaleChance(saleChance);

        HashMap<String, Object> map = new HashMap<>();
        if (flag) {
            map.put("code", 0);
            map.put("msg", "成功删除");
        } else {
            map.put("code", 1);
            map.put("msg", "删除失败");
        }

        return map;
    }

    @RequestMapping("/editSaleChance")
    public Map<String, Object> editSaleChance(SaleChance saleChance) {
        Boolean flag = saleChanceService.editSaleChance(saleChance);

        HashMap<String, Object> map = new HashMap<>();
        if (flag) {
            map.put("code", 0);
            map.put("msg", "成功修改");
        } else {
            map.put("code", 1);
            map.put("msg", "修改失败");
        }
        return map;
    }

    @RequestMapping("/insertSaleChance")
    public Map<String, Object> insertSaleChance(SaleChance saleChance) {
        boolean flag = saleChanceService.insertSaleChance(saleChance);
        HashMap<String, Object> map = new HashMap<>();
        if (flag) {
            map.put("code", 0);
            map.put("msg", "添加成功");
        } else {
            map.put("code", 1);
            map.put("msg", "添加失败");
        }
        return map;
    }

    @RequestMapping("/scComRep")
    public Map<String, Object> scComRep() {
        List<Report> rep = saleChanceService.getScCom();
        HashMap<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("msg", "成功查询");
//        map.put("data", rep);
        ArrayList<String> xdata = new ArrayList<>();
        ArrayList<Integer> ydata = new ArrayList<>();

        for (Report report : rep) {
            String res = null;
            switch (report.getItem()) {
                case '0':
                    res = "促销";
                    break;
                case '1':
                    res = "广告";
                    break;
                case '2':
                    res = "搜索引擎";
                    break;
                case '3':
                    res = "线上咨询";
                    break;
                case '4':
                    res = "电话咨询";
                    break;
                case '5':
                    res = "邮件咨询";
                    break;
                case '6':
                    res = "客户介绍";
                    break;
                default:
                    res="未知";
            }
            xdata.add(res);
            ydata.add(report.getNum());
        }
        map.put("xdata",xdata);
        map.put("ydata",ydata);
        return map;
    }
}

