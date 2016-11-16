package com.ssm.demo.service.impl;

import java.io.Serializable;

import lombok.extern.slf4j.Slf4j;

import com.ssm.demo.service.BaseService;

@Slf4j
public abstract class BaseServiceImpl<E extends Serializable, PK> implements BaseService<E, PK> {

}
