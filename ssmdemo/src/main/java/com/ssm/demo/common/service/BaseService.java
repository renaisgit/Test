package com.ssm.demo.common.service;

import java.util.List;

/**
 * 服务
 * @author CHEN SHUAI
 *
 * @param <E>
 * @param <PK>
 */
public interface BaseService<E, PK> {

	public List<E> findbyQuery(BaseQuery query);
}
