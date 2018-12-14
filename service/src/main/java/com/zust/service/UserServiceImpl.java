package com.zust.service;


import com.zust.commom.util.ActionReturnUtil;
import com.zust.commom.util.MD5Util;
import com.zust.dao.User.UserMapper;
import com.zust.dao.User.bean.User;
import org.mockito.internal.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @auther 叶连松
 * @date 2018/11/27 14:06
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(String username, String password) throws Exception {
        User user = userMapper.findByUsername(username);
        try{
            if (user.getPassword().equals(MD5Util.convertToMD5(password))){
                return user;
            }
            return null;
        }catch (Exception e){
            throw e;
        }
    }
}
