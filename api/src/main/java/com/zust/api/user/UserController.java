package com.zust.api.user;

import com.zust.commom.util.ActionReturnUtil;
import com.zust.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @auther 叶连松
 * @date 2018/12/2 18:29
 */
@Api(description = "用户相关操作")
@RestController
public class UserController {

//    @Autowired
//    private UserService userService;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @ApiOperation(value = "获取用户名", notes = "根据条件筛选用户列表")
    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public ActionReturnUtil getName(@RequestParam(value = "userId")Integer userId)throws Exception{
    //String s = userService.myname(userId);
        return ActionReturnUtil.returnSuccessWithData("55");
    }
}

