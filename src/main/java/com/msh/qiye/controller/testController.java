package com.msh.qiye.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class testController {

    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id){
        System.out.println("id==="+id);
        return "hello,CRM";

    }
}
