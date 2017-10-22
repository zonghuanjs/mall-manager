package com.mall.service;

import java.util.List;

import com.mall.pojo.User;

public interface UserService {

	int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    List<User> selectByUsername(String username);
}
