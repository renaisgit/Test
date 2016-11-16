package com.ssm.demo.service.impl;

import java.io.Serializable;

import lombok.extern.slf4j.Slf4j;

import com.ssm.demo.service.BaseService;

/**
 * 服务实现
 * @author CHEN SHUAI
 *
 * @param <E>
 * @param <PK>
 */
@Slf4j
public abstract class BaseServiceImpl<E extends Serializable, PK> implements BaseService<E, PK> {

}
