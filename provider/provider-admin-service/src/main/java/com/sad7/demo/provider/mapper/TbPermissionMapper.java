package com.sad7.demo.provider.mapper;

import com.sad7.demo.provider.domain.TbPermission;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface TbPermissionMapper extends Mapper<TbPermission> {

    List<TbPermission> selectByUserId(@Param("id") Long id);

}