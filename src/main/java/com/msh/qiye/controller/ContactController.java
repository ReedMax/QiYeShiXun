package com.msh.qiye.controller;





import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.msh.qiye.pojo.Contact;
import com.msh.qiye.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.core.metadata.IPage;



@CrossOrigin
@RestController
@RequestMapping("/contact")
public class ContactController {
    @Autowired
    ContactService contactService;

    @RequestMapping("/contactList")
    public Map<String,Object> getContactList(){
        List<Contact> contactList=contactService.getContactList();
        HashMap<String,Object> map=new HashMap<>();
        map.put("code",0);
        map.put("msg","成功查询");
        map.put("data",contactList);
        return map;
    }
    @RequestMapping("/contactPageList")
    public  Map<String,Object> getContactPageList(Integer currentPages,Integer limitNums){
        IPage<Contact> contactPageList=contactService.getContactPage(currentPages,limitNums);
        HashMap<String,Object> map=new HashMap<>();
        map.put("code",0);
        map.put("msg","成功查询");
        map.put("total",contactPageList.getTotal());
        map.put("detailData",contactPageList.getRecords());
        return map;
    }
    @RequestMapping("/contactPageListUser")
    public  Map<String,Object> getContactPageList(Integer currentPages,Integer limitNums,Integer cusId){
        System.out.println("!!!!!!"+cusId);
        IPage<Contact> contactPageList=contactService.getContactPage(currentPages,limitNums,cusId);
        HashMap<String,Object> map=new HashMap<>();
        map.put("code",0);
        map.put("msg","成功查询");
        map.put("total",contactPageList.getTotal());
        map.put("detailData",contactPageList.getRecords());
        return map;
    }
    @RequestMapping("/delContact")
    public  Map<String,Object> delContact(Contact contact){
        boolean flag=contactService.delContact(contact);
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
    @RequestMapping("/updateContact")
    public  Map<String,Object> updateContact(Contact contact){
        boolean flag=contactService.updateContact(contact);
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
    @RequestMapping("/insertContact")
    public  Map<String,Object> insertContact(Contact contact){
        boolean flag=contactService.insertContact(contact);
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



