package com.school.service;

import com.github.pagehelper.Page;
import com.school.entity.Admin;

import java.util.List;

public interface AdminService {
    //PageInfo<Admin> selectAll(int pageNum, int pageSize);

    List<Admin> selectAll();
    Page<Admin> getAll();
}
