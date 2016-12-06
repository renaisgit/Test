package com.ssm.demo.service;

import com.ssm.demo.common.page.PageBean;
import com.ssm.demo.common.service.BaseQuery;
import com.ssm.demo.models.SysUser;

/**
 * @描述：用户服务
 * @作者：renais
 * @创建时间：2016-12-6,下午2:00:16
 * @版本： 1.0
 */
public interface UserService extends BaseService<SysUser, String>{

	public PageBean findPageByQuery(BaseQuery query);
}
