/*
 * 2017/03/01 自动生成 新規作成
 *
 * (c) 江苏润和.
 */
 package com.bms.agif.service;

import com.bms.agif.bean.param.BaseBean;
import com.bms.agif.bean.param.ButlerExpEducationRsParam;
import com.framework.boot.base.BaseService;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>AgifButlerExpEducationService接口。</p>
 *
 * @author 自动生成
 * @version 1.00
 */
 public interface AgifButlerExpEducationService extends BaseService{
 @Transactional
  Integer saveExpEducation(ButlerExpEducationRsParam param);
 @Transactional
  Integer updateExpEducation(BaseBean<ButlerExpEducationRsParam, ButlerExpEducationRsParam> param);

 }