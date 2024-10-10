package com.msh.qiye.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import com.msh.qiye.dao.ContactDao;
import com.msh.qiye.pojo.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {
    @Autowired
    ContactDao contactDao;

    public List<Contact> getContactList() {
        List<Contact> contactList = contactDao.selectList(null);
        return contactList;
    }

    public IPage<Contact> getContactPage(Integer currentPage, Integer limitNum) {
        Page<Contact> contactPage = new Page<>(currentPage, limitNum);
        contactDao.selectPage(contactPage, null);
        return contactPage;
    }

    public IPage<Contact> getContactPage(Integer currentPage, Integer limitNum, Integer cus_id) {
        Page<Contact> contactPage = new Page<>(currentPage, limitNum);

        // 创建查询条件构造器
        QueryWrapper<Contact> queryWrapper = new QueryWrapper<>();

        queryWrapper.eq("cus_id", cus_id);


        contactDao.selectPage(contactPage, queryWrapper);
        return contactPage;
    }


    public Boolean delContact(Contact contact) {
        int i = contactDao.deleteById(contact);
        return i > 0;
    }

    public Boolean updateContact(Contact contact) {
        int i = contactDao.updateById(contact);
        return i > 0;
    }

    public Boolean insertContact(Contact contact) {
        int i = contactDao.insert(contact);
        return i > 0;
    }

}

