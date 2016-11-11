package com.ssm.demo.service.impl;

import java.io.Serializable;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.ssm.demo.common.service.impl.CommonServiceImpl;
import com.ssm.demo.service.BaseService;

@Slf4j
public abstract class BaseServiceImpl<E extends Serializable, PK> extends CommonServiceImpl<E, PK> implements BaseService<E, PK>, ApplicationContextAware {

	public ApplicationContext applicationContext;

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}
}
