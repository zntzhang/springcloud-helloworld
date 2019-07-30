package com.springcloud.mapper;

import com.springcloud.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: zhangtao
 * @Description:
 * @Date: Created in 16:07 2019/7/30
 * @Modified By:
 */
@Mapper
public interface UserMapper {
    /**
     * 新增用户
     * @param user
     * @return
     */
    int save (User user);

    /**
     * 更新用户信息
     * @param user
     * @return
     */
    int update (User user);

    /**
     * 根据id删除
     * @param id
     * @return
     */
    int deleteById (int id);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    User selectById (int id);

    /**
     * 查询所有用户信息
     * @return
     */
    List<User> selectAll ();
}
