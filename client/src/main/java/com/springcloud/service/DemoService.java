package com.springcloud.service;

import com.springcloud.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: zhangtao
 * @Description:
 * @Date: Created in 15:32 2019/7/30
 * @Modified By:
 */
public interface DemoService {
    List<User> getUserList();
}
