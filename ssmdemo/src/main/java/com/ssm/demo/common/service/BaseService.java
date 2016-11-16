package com.ssm.demo.common.service;

import java.util.List;

public interface BaseService<E, PK> {

	public List<E> findbyQuery(BaseQuery query);
}
