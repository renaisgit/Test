package com.ssm.demo.service.query;


import com.ssm.demo.common.service.BaseQuery;

import lombok.Data;

/**
 * 用户查询
 * @author CHENSHUAI
 *
 */
@Data
public class UserQuery extends BaseQuery {
	private Integer userId;
}
