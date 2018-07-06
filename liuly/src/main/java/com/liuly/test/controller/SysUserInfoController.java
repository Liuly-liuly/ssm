package com.liuly.test.controller;

import com.liuly.test.service.ISysUserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by hand on 2018/2/9.
 */
@Controller
public class SysUserInfoController {
    @Autowired
    private ISysUserInfo sysUserInfo;

    @RequestMapping("/sysUser/query/{id}")
    public String queryName(HttpServletRequest request,@PathVariable long id,
                            HttpServletResponse response){
        request.setAttribute("user", sysUserInfo.queryByUserId(id));
        return  "userInfo";
    }
}
