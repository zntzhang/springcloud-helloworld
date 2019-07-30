package com.springcloud.feign;

import com.springcloud.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Author: zhangtao
 * @Description:
 * @Date: Created in 16:57 2019/4/9
 * @Modified By:
 */
@Service
public class FeignServiceImpl implements FeignService{
    //实现的方法是服务调用的降级方法
    @Override
    public String hello() {
        return "error";
    }

    @Override
    public String hello(String name) {
        return "error";
    }

    @Override
    public User hello(String name, Integer age) {
        return new User();
    }

    @Override
    public String hello(User user) {
        return "error";
    }
}
