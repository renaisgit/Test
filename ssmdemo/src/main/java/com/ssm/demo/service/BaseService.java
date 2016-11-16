package com.ssm.demo.service;

import java.util.List;

import com.ssm.demo.common.service.BaseQuery;

/**
 * @author CHEN SHUAI
 *
 * @param <T>
 * @param <PK>
 */
public interface BaseService<T, PK>{

	/**
	 * 查询集合
	 * @param query
	 * @return
	 */
	public List<T> findByQuery(BaseQuery query);
	
}
