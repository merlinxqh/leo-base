package com.leo.service.impl;

import com.leo.base.dao.CrudMapper;
import com.leo.base.service.impl.BaseCrudServiceImpl;
import com.leo.mapper.TResourceMapper;
import com.leo.service.TResourceService;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * 
 * @author ffzx
 * @date 2017-02-26 19:07:12
 * @version 1.0.0
 * @copyright www.ffzxnet.com
 */
@Service("tResourceService")
public class TResourceServiceImpl extends BaseCrudServiceImpl implements TResourceService {

    @Resource
    private TResourceMapper tResourceMapper;

    @Override
    public CrudMapper init() {
        return tResourceMapper;
    }
}