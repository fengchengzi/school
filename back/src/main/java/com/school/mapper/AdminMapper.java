package com.school.mapper;

import com.github.pagehelper.Page;
import com.school.entity.Admin;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface AdminMapper {
    //1 @Mapper将UserDao声明为一个Mapper接口
    //2 @Results是结果映射列表，@Result中property是User类的属性名，column是数据库表的字段名
    //3 @Select, @Insert 分别代表了执行的真实SQL
    @Results({
            @Result(property = "idAdmin" ,column="id_admin"),
            @Result(property = "adminAccount",column = "admin_account"),
            @Result(property = "adminPassword",column = "admin_password"),
            @Result(column="admin_name", property="adminName"),
            @Result(column="admin_reg_time", property="adminRegTime")
    })

//    @Insert("INSERT INTO admin(adminAccount, adminPassword, adminName) VALUES(#{account}, #{password}, #{name})")
//    int insert(@Param("name") String account, @Param("password") String password, @Param("name") String name);

    int deleteByPrimaryKey(Integer idAdmin);

    int insert(Admin record);

    int insertSelective(Admin record);

    @Select("select * from admin where id = #{id}")
    Admin selectByPrimaryKey(Integer idAdmin);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);

    @Select("select * from admin")
    List<Admin> selectAll();

    @Select("select * from admin")
    Page<Admin> getAll();
}