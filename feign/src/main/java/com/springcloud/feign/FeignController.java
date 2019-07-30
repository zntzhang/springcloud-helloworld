package com.springcloud.feign;

import com.springcloud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhangtao
 * @Description:
 * @Date: Created in 16:43 2019/4/9
 * @Modified By:
 */
@RestController
public class FeignController {
    @Autowired
    FeignService feignServiceImpl;

    @RequestMapping("/consumer")
    public String helloConsumer() {
        return feignServiceImpl.hello();
    }

    @RequestMapping("/consumer2")
    public String helloConsumer2() {
        String r1 = feignServiceImpl.hello("hjc");
        String r2 = feignServiceImpl.hello("hjc", 23) + "";
        String r3 = feignServiceImpl.hello(new User("hjc", 23));
        return r1 + "-----" + r2 + "----" + r3;
    }
}
