package com.springcloud.api;

import com.springcloud.entity.HelloObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @Author: zhangtao
 * @Description:
 * @Date: Created in 11:17 2019/3/27
 * @Modified By:
 */
@Controller
public class HelloWorldApi {
    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/")
    public String handleRequest(Model model) {
        //accessing hello-service
        List<ServiceInstance> instances = discoveryClient.getInstances("client");
        if (instances != null && instances.size() > 0) {//todo: replace with a load balancing mechanism
            ServiceInstance serviceInstance = instances.get(0);
            String url = serviceInstance.getUri().toString();
            url = url + "/hello";
            RestTemplate restTemplate = new RestTemplate();
            HelloObject helloObject = restTemplate.getForObject(url,
                    HelloObject.class);
            model.addAttribute("msg", helloObject.getMessage());
            model.addAttribute("time", LocalDateTime.now());
        }
        return "hello-page";
    }
}
