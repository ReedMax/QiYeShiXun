package com.msh.qiye.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.msh.qiye.dao.UserDao;
import com.msh.qiye.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public List<User> getUserList() {
        List<User> userList = userDao.selectList(null);
        return userList;
    }

    public User getUser(String uname, String pwd) {
        QueryWrapper<User> user = new QueryWrapper<>();
        user.eq("u_name", uname).eq("u_password", pwd);
        User res=userDao.selectOne(user);
        return res;
    }


}
