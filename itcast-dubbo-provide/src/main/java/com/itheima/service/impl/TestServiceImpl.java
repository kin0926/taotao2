package com.itheima.service.impl;

import com.itheima.service.TestService;
import org.apache.dubbo.config.annotation.Service;

//如果一个类想要发布服务，那么这个类就要打上一个注解。
@Service
public class TestServiceImpl implements TestService {
    public void sayHi() {
        System.out.println("TestServiceImpl的sayHi方法被调用");
    }
}
