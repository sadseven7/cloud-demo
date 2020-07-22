package com.sad7.demo.provider.api;

import com.sad7.demo.provider.domain.TbPermission;

import java.util.List;

public interface TbPermissionService{

    List<TbPermission> selectByUserId(Long id);

}
