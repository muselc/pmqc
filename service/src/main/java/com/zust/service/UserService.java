package com.zust.service;

import com.zust.commom.util.ActionReturnUtil;

public interface UserService {
    ActionReturnUtil login(String username,String password) throws Exception;
}
