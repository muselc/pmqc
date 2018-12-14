package com.zust.dao.User;

import com.zust.dao.User.bean.User;
import com.zust.dao.User.bean.UserExample;
import java.util.List;

public interface UserMapper {
    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User findByusername(String username);
}