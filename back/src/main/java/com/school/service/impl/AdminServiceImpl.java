package com.school.service.impl;

import com.github.pagehelper.Page;
import com.school.entity.Admin;
import com.school.mapper.AdminMapper;
import com.school.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public List<Admin> selectAll() {

        return adminMapper.selectAll();
    }

    @Override
    public Page<Admin> getAll() {
        return adminMapper.getAll();
    }
}
