package com.atguigu.mybatisplus.mapper;

import com.atguigu.mybatisplus.entiy.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resources;

@Repository
public interface UserMapper extends BaseMapper<User> {
}
