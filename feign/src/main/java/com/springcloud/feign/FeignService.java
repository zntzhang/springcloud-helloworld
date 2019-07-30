package com.springcloud.feign;

import com.springcloud.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: zhangtao
 * @Description:
 * @Date: Created in 16:44 2019/4/9
 * @Modified By:
 */
//configuration = xxx.class  这个类配置Hystrix的一些精确属性
//value=“你用到的服务名称”

@FeignClient(value = "client",fallback = FeignServiceImpl.class)
public interface FeignService {

    //服务中方法的映射路径
    @RequestMapping("/hello")
    String hello();

    @RequestMapping(value = "/hellol", method= RequestMethod.GET)
    String hello(@RequestParam("name") String name) ;

    @RequestMapping(value = "/hello2", method= RequestMethod.GET)
    User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age);

    @RequestMapping(value = "/hello3", method= RequestMethod.POST)
    String hello(@RequestBody User user);

}
