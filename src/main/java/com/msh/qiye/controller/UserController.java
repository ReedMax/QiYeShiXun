package com.msh.qiye.controller;


import com.msh.qiye.pojo.SaleChance;
import com.msh.qiye.pojo.User;
import com.msh.qiye.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

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
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/getUserList")
    public Map<String, Object> getUserList(User user) {
        List<User> userList = userService.getUserList();
        HashMap<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("msg", "成功查询");
        map.put("data", userList);

        return map;
    }

    @RequestMapping("/login")
    public Map<String, Object> login(String uname, String pwd) {
        User res = userService.getUser(uname, pwd);

        HashMap<String, Object> map = new HashMap<>();

        if (res != null) {
            map.put("code", 0);
            map.put("msg", "成功查询");
            map.put("data", res);
        }else{
            map.put("code", 1);
            map.put("msg", "无用户");
        }
        return map;
    }


}

