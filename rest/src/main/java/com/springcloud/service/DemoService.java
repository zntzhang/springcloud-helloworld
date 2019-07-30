package com.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: zhangtao
 * @Description:
 * @Date: Created in 15:10 2019/7/30
 * @Modified By:
 */
@Service
public class DemoService {
    @Autowired
    private RestTemplate restTemplate;

    //请求熔断注解，当服务出现问题时候会执行fallbackMetho属性的名为helloFallBack的方法
    @HystrixCommand(fallbackMethod = "helloFallBack")
    public String getUserList() {
        return restTemplate.getForEntity("http://client/getUserList",String.class).getBody();
    }

    public String helloFallBack(){
        return "error";
    }
}
