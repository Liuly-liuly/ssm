package com.liuly.test.service.Impl;

import com.liuly.test.service.ISysUserInfo;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by hand on 2018/2/9.
 */
@RunWith(SpringJUnit4ClassRunner.class)//好比继承这个类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})//resources下的多个配置文件都需要写入进去
public class SysUserInfoImpTest {
//   private ApplicationContext ac;//有上面的注解机制就不需要Junit的方式
    @Autowired
    private ISysUserInfo info;
//    @Before
//    public void before(){
//         ac=new ClassPathXmlApplicationContext(new String[]{"spring-mybatis.xml"});
//         info =(ISysUserInfo)ac.getBean("SysUserInfo");
//    }

    @Test
    public void queryByUserId() throws Exception {
        String username=info.queryByUserId((long)10003).getUserName();
        System.out.println(username);
    }
    @Test
    public void  test()throws Exception{
        String username=info.queryByUserId((long)10001).getUserName();
        System.out.println(username);
    }

}