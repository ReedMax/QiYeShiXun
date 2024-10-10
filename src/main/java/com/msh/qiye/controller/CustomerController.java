package com.msh.qiye.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;

import com.msh.qiye.pojo.Customer;
import com.msh.qiye.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lin
 * @since 2024-10-08
 */
@CrossOrigin
@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @RequestMapping("/customerList")
    public Map<String,Object> getCustomerList(){
        List<Customer> customerList=customerService.getCustomerList();
        HashMap<String,Object> map=new HashMap<>();
        map.put("code",0);
        map.put("msg","成功查询");
        map.put("data",customerList);
        return map;
    }
    @RequestMapping("/customerPageList")
    public  Map<String,Object> getCustomerPageList(Integer currentPages,Integer limitNums){
        IPage<Customer> customerPageList=customerService.getCustomerPage(currentPages,limitNums);
        HashMap<String,Object> map=new HashMap<>();
        map.put("code",0);
        map.put("msg","成功查询");
        map.put("total",customerPageList.getTotal());
        map.put("detailData",customerPageList.getRecords());
        return map;
    }
    @RequestMapping("/delCustomer")
    public  Map<String,Object> delCustomer(Customer customer){
//        System.out.println(customer.toString());
        boolean flag=customerService.delCustomer(customer);
        HashMap<String,Object> map=new HashMap<>();
        if (flag){
            map.put("code",0);
            map.put("msg","成功删除");
        }else {
            map.put("code",1);
            map.put("msg","删除失败");
        }
        return map;
    }
    @RequestMapping("/updateCustomer")
    public  Map<String,Object> updateCustomer(Customer customer){
        boolean flag=customerService.updateCustomer(customer);
        HashMap<String,Object> map=new HashMap<>();
        if (flag){
            map.put("code",0);
            map.put("msg","修改成功");
        }else {
            map.put("code",1);
            map.put("msg","修改失败");
        }
        return map;
    }
    @RequestMapping("/insertCustomer")
    public  Map<String,Object> insertCustomer(Customer customer){
//        System.out.println(customer);
        boolean flag=customerService.insertCustomer(customer);
        HashMap<String,Object> map=new HashMap<>();
        if (flag){
            map.put("code",0);
            map.put("msg","添加成功");
        }else {
            map.put("code",1);
            map.put("msg","添加失败");
        }
        return map;
    }
}