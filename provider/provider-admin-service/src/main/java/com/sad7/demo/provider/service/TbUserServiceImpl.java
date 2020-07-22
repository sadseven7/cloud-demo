package com.sad7.demo.provider.service;

import com.sad7.demo.provider.domain.TbUser;

import javax.annotation.Resource;
import com.sad7.demo.provider.mapper.TbUserMapper;
import com.sad7.demo.provider.api.TbUserService;
import org.apache.dubbo.config.annotation.Service;
import tk.mybatis.mapper.entity.Example;

@Service(version = "1.0.0")
public class TbUserServiceImpl implements TbUserService{

    @Resource
    private TbUserMapper tbUserMapper;

    @Override
    public TbUser getByUsername(String username) {
        Example example = new Example(TbUser.class);
        example.createCriteria().andEqualTo("username",username);
        return tbUserMapper.selectOneByExample(example);
    }
}
