package com.liuly.test.mapper;

import com.liuly.test.dto.SysUserRole;

public interface SysUserRoleMapper {
    int deleteByPrimaryKey(Long surId);

    int insert(SysUserRole record);

    int insertSelective(SysUserRole record);

    SysUserRole selectByPrimaryKey(Long surId);

    int updateByPrimaryKeySelective(SysUserRole record);

    int updateByPrimaryKey(SysUserRole record);
}