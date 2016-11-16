package com.ssm.demo.service;

import java.util.List;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.ssm.demo.common.service.BaseQuery;
import com.ssm.demo.models.SysUser;

/**
 * 用户服务
 * @author CHEN SHUAI
 *
 */
public interface UserService extends BaseService<SysUser, String>{

	public List findPageByQuery(BaseQuery query,PageBounds pageBounds);
}
