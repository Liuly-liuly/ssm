package com.liuly.test.service.Impl;

import com.liuly.test.dto.SysUser;
import com.liuly.test.mapper.SysUserMapper;
import com.liuly.test.service.ISysUserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 * Created by hand on 2018/2/8.
 */
@Service("SysUserInfo")
public class SysUserInfoImp implements ISysUserInfo {
    @Autowired
    private SysUserMapper sysUserMapper;

    public SysUser queryByUserId(Long id){
        return   sysUserMapper.selectByPrimaryKey(id);
    }

}
