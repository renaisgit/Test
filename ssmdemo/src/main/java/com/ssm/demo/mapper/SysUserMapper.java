package com.ssm.demo.mapper;

import java.util.List;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.ssm.demo.common.mapper.BaseMapper;
import com.ssm.demo.common.service.BaseQuery;
import com.ssm.demo.models.SysUser;

public interface SysUserMapper extends BaseMapper<SysUser, String>{
	
	List selectPageByQuery(BaseQuery query,PageBounds pageBounds);
}