package com.msh.qiye.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.msh.qiye.dao.SaleChanceDao;
import com.msh.qiye.pojo.Report;
import com.msh.qiye.pojo.SaleChance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleChanceService {
    @Autowired
    SaleChanceDao saleChanceDao;

    public List<SaleChance> getSaleList() {
        List<SaleChance> saleList = saleChanceDao.selectList(null);
        return saleList;
    }

    //分页查询数据
    public IPage<SaleChance> getSalePageData(Integer currentPage, Integer limitNum) {
        //创建page对象
        Page<SaleChance> salePage = new Page<>(currentPage, limitNum);

        saleChanceDao.selectPage(salePage, null);

        return salePage;
    }

    //删除
    public Boolean deletSaleChance(SaleChance saleChance) {
        int i = saleChanceDao.deleteById(saleChance);
        return i > 0 ? true : false;
    }

    //编辑
    public Boolean editSaleChance(SaleChance saleChance) {
        int i = saleChanceDao.updateById(saleChance);
        return i > 0 ? true : false;
    }
    //新增
    public Boolean insertSaleChance(SaleChance saleChance) {
        int i = saleChanceDao.insert(saleChance);
        return i > 0;
    }

    public List<Report> getScCom(){
        List<Report> reportList=saleChanceDao.countByscCom();
        return reportList;
    }


}
