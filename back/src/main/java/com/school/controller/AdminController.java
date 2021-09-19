package com.school.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.school.entity.Admin;
import com.school.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@ResponseBody
@CrossOrigin
public class AdminController {

    @Autowired

    private AdminService adminService;


    @RequestMapping("/admin")
    public String listAdmin(){

        List<Admin> listAll=adminService.selectAll();
        return "ok! this is admin name list："+listAll;

    }
    @GetMapping("/admin/list")
    public Page<Admin> listAdmin(@RequestParam String query,
            @RequestParam(defaultValue="1")Integer pageNum,
                                 @RequestParam(defaultValue = "1")Integer pageSize){


       // Page<Admin> adminPage=new Page (pageNum,pageSize);
        PageHelper.startPage(pageNum, pageSize);
        Page<Admin> page=adminService.getAll();
        return page;

    }

    @GetMapping("/admin/get")
    public String listAdmin(
                                 @RequestParam(defaultValue="1")Integer pageNum,
                                 @RequestParam(defaultValue = "1")Integer pageSize){


        // Page<Admin> adminPage=new Page (pageNum,pageSize);
        PageHelper.startPage(pageNum, pageSize);
        Page<Admin> page=adminService.getAll();
        String str=page.toString();
        return str+"--"+page.getTotal();

    }

    @RequestMapping("/reg")
    public String reg(){
        return "reg";
    }

    @RequestMapping("/regadmin")
    public int regAdmin(){
        return 1;
    }
}
