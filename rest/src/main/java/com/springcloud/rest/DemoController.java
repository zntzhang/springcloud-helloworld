package com.springcloud.rest;

import com.springcloud.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: zhangtao
 * @Description:
 * @Date: Created in 15:06 2019/7/30
 * @Modified By:
 */
public class DemoController {
    @Autowired
    private DemoService demoService;

    @RequestMapping("/getUserList")
    public String getUserList() {
        return demoService.getUserList();
    }
}
