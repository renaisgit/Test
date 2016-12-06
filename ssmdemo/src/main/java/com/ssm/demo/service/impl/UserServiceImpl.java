package com.ssm.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.ssm.demo.common.page.PageBean;
import com.ssm.demo.common.service.BaseQuery;
import com.ssm.demo.mapper.SysUserMapper;
import com.ssm.demo.models.SysUser;
import com.ssm.demo.service.UserService;

/**
 * 用户服务实现
 * @author Administrator
 *
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<SysUser, String> implements UserService {

	@Autowired
	private SysUserMapper sysUserMapper;

	@Override
	public List<SysUser> findByQuery(BaseQuery query) {
		// TODO Auto-generated method stub
		return sysUserMapper.selectByQuery(query);
	}

	@Override
	public PageBean findPageByQuery(BaseQuery query) {
		// TODO Auto-generated method stub
		 query.setRecordList(sysUserMapper.getSysUserListPage(query));
		 return query;
	}

}
