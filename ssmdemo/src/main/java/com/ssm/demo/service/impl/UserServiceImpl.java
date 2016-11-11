package com.ssm.demo.service.impl;

import org.springframework.stereotype.Service;

import com.ssm.demo.common.mapper.BaseMapper;
import com.ssm.demo.mapper.SysUserMapper;
import com.ssm.demo.models.SysUser;
import com.ssm.demo.service.UserService;

@Service
public class UserServiceImpl extends BaseServiceImpl<SysUser, String> implements UserService {

	@Override
	public BaseMapper getMapper() {
		// TODO Auto-generated method stub
		return applicationContext.getBean(SysUserMapper.class);
	}

}
