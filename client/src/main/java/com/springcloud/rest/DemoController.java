package com.springcloud.rest;

import com.springcloud.entity.User;
import com.springcloud.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: zhangtao
 * @Description:
 * @Date: Created in 15:29 2019/7/30
 * @Modified By:
 */
@RestController
public class DemoController {
    @Autowired
    private DemoService demoService;

    @RequestMapping(value = "/getUserList", method = RequestMethod.GET)
    public List<User> getUserList() {
        return demoService.getUserList();
    }
}
