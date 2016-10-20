package com.ssm.demo.service.query;

import com.ssm.demo.common.service.query.BaseQuery;

import lombok.Data;

@Data
public class UserQuery extends BaseQuery {
	private Integer userId;
}
