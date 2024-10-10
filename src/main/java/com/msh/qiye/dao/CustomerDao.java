package com.msh.qiye.dao;

import com.msh.qiye.pojo.Customer;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author msh
 * @since 2024-09-19
 */
@Mapper
public interface CustomerDao extends BaseMapper<Customer> {

}
