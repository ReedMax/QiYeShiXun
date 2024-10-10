package com.msh.qiye.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.msh.qiye.pojo.Report;
import com.msh.qiye.pojo.SaleChance;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lin
 * @since 2024-09-26
 */
@Mapper
public interface SaleChanceDao extends BaseMapper<SaleChance> {
    @Select("select count(*) num,sc_comming item from t_sale_chance group by sc_comming;")
    public List<Report> countByscCom();
}