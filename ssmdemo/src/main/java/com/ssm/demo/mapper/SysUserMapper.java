package com.ssm.demo.mapper;

import java.util.List;

import com.ssm.demo.common.mapper.BaseMapper;
import com.ssm.demo.common.service.BaseQuery;
import com.ssm.demo.models.SysUser;

/**
 * 用户mapper
 * @author CHEN SHUAI
 *
 */
public interface SysUserMapper extends BaseMapper<SysUser, String>{
	
	List<SysUser> getSysUserListPage(BaseQuery query);
	
}