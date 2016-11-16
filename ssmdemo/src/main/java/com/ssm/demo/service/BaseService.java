package com.ssm.demo.service;

import java.util.List;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.ssm.demo.common.service.BaseQuery;

public interface BaseService<T, PK>{

	public List<T> findByQuery(BaseQuery query);
	
}
