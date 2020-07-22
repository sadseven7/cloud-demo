package com.sad7.demo.provider.service;

import com.sad7.demo.provider.domain.TbPermission;

import javax.annotation.Resource;
import com.sad7.demo.provider.mapper.TbPermissionMapper;
import com.sad7.demo.provider.api.TbPermissionService;
import org.apache.dubbo.config.annotation.Service;

import java.util.List;

@Service(version = "1.0.0")
public class TbPermissionServiceImpl implements TbPermissionService{

    @Resource
    private TbPermissionMapper tbPermissionMapper;

    @Override
    public List<TbPermission> selectByUserId(Long id) {
        return tbPermissionMapper.selectByUserId(id);
    }
}
