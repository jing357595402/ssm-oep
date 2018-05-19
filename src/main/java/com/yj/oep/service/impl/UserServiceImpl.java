package com.yj.oep.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yj.oep.entity.User;
import com.yj.oep.mapper.UserMapper;
import com.yj.oep.service.IUserService;

@Service("userService")
@Transactional(readOnly = true)
public class UserServiceImpl implements IUserService {
	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> selectAllUsers() {
		return userMapper.selectAllUsers();
	}
}
