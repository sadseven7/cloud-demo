package com.sad7.demo.provider.service;

import javax.annotation.Resource;
import com.sad7.demo.provider.mapper.TbRoleMapper;
import com.sad7.demo.provider.api.TbRoleService;
import org.apache.dubbo.config.annotation.Service;

@Service(version = "1.0.0")
public class TbRoleServiceImpl implements TbRoleService{

    @Resource
    private TbRoleMapper tbRoleMapper;

}
