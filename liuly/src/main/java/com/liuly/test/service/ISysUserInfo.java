package com.liuly.test.service;

import com.liuly.test.dto.SysUser;

/**
 * Created by hand on 2018/2/8.
 */
public interface ISysUserInfo {

   SysUser queryByUserId(Long id);

}
