package com.spring.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: zhangtao
 * @Description:
 * @Date: Created in 17:24 2019/4/8
 * @Modified By:
 */
@RestController
public class HelloController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private HelloService helloService;

    @RequestMapping("/consumer")
    public String helloConsumer() {
        //面向服务调用，不再面向IP调用 client是service的application name,不是ip或域名
        return restTemplate.getForEntity("http://client/hello", String.class).getBody();
    }

    /**
     * 测试hystrix
     * @return
     */
    @RequestMapping("/consumer2")
    public String helloConsumer2() {
        return helloService.helloService();
    }
}
