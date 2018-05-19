package com.yj.oep.mapper;

import java.util.List;

import com.yj.oep.entity.User;

public interface UserMapper {
	/**
	 * 查询所有用户信息
	 * 
	 * @return
	 */
	List<User> selectAllUsers();
	// Integer userCount();
}
