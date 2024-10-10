package com.msh.qiye.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;


import com.msh.qiye.dao.CustomerDao;
import com.msh.qiye.pojo.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerDao customerDao;
    public List<Customer> getCustomerList(){
        List<Customer> customerList=customerDao.selectList(null);
        return customerList;
    }
    public IPage<Customer> getCustomerPage(Integer currentPage, Integer limitNum){
        Page<Customer> customerPage=new Page<>(currentPage,limitNum);
        customerDao.selectPage(customerPage,null);
        return customerPage;
    }
    public Boolean delCustomer(Customer customer){
        int i=customerDao.deleteById(customer);
        return i>0;
    }

    public Boolean updateCustomer(Customer customer){
        int i=customerDao.updateById(customer);
        return i>0;
    }
    public Boolean insertCustomer(Customer customer){
        int i=customerDao.insert(customer);
        return i>0;
    }

}