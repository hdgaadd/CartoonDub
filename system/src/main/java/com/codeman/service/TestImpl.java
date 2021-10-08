package com.codeman.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codeman.entity.User;
import com.codeman.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.Serializable;
@Service
public class TestImpl extends ServiceImpl<UserMapper, User> {
    @Resource
    protected UserMapper baseMapper;
    public User getById(Serializable id) {
        User user = baseMapper.selectById(id);
        // eduTeacher.setId("666");
        user.setEmail("hello");
        return user;
    }
}
