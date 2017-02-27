package com.leo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.leo.base.api.dto.User;
import com.leo.base.page.Page;

/**
 * 用户数据映射
 */
public interface UserMapper {

    @Select(value="select username,password,enabled from users where username = #{username}")
    User loadUserByUsername(@Param("username") String username);
    @Insert(value="insert into users (username, password, enabled, create_date) value(#{username},#{password},#{enabled},#{createDate})")
    void saveUser(User user);
    
    @Select(value="select username,password,enabled,create_date as createDate from users")
    List<User> getUserList();
    
    @Select(value="select username,password,enabled,create_date as createDate from users")
    List<User> queryPage(@Param("page")Page page);
    
    
}
