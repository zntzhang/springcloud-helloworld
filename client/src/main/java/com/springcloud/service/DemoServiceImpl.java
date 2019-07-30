package com.springcloud.service;

import com.springcloud.entity.User;
import com.springcloud.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: zhangtao
 * @Description:
 * @Date: Created in 15:32 2019/7/30
 * @Modified By:
 */
@Service
public class DemoServiceImpl implements DemoService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> getUserList() {
        return userMapper.selectAll();
    }
}
