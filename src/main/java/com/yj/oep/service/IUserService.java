package com.yj.oep.service;

import java.util.List;

import com.yj.oep.entity.User;

/**
 * @author YJ
 * @date 2018年5月15日 下午4:02:14
 * @描述 用户业务逻辑层
 */
public interface IUserService {
	List<User> selectAllUsers();
}
