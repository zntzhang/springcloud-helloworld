package com.springcloud.client;

import com.springcloud.entity.HelloObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @Author: zhangtao
 * @Description:
 * @Date: Created in 11:17 2019/3/27
 * @Modified By:
 */
@RestController
public class HelloWorldApi {

    private AtomicLong counter = new AtomicLong();

    @GetMapping("/hello")
    public HelloObject getHelloWordObject() {
        HelloObject hello = new HelloObject();
        hello.setMessage("Hi there! you are number " + counter.incrementAndGet());
        return hello;
    }
}
