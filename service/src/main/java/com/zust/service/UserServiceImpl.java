package com.zust.service;


import org.springframework.stereotype.Service;

/**
 * @auther 叶连松
 * @date 2018/11/27 14:06
 */
@Service
public class UserServiceImpl implements UserService{

    @Override
    public String myname(int id) throws Exception {
        return "test";
    }
}
