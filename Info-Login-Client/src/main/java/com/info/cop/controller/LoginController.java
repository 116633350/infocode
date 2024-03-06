package com.info.cop.controller;


import com.info.cop.mybatis.mapper.UsersMapper;
import com.info.cop.mybatis.pojo.UsersTbDo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping(value = "/login")
public class LoginController {

    @Autowired
    private UsersMapper usersMapper;

    /**
     * 用户信息列表
     */
    @GetMapping
    public List findAllUsers(@RequestParam Map<String, Object> params) {
        List<UsersTbDo> list = usersMapper.selectList(null);
        return list;
    }

}