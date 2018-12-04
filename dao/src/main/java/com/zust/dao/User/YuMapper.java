package com.zust.dao.User;

import com.zust.dao.User.bean.Yu;
import com.zust.dao.User.bean.YuExample;
import java.util.List;

public interface YuMapper {
    int deleteByExample(YuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Yu record);

    int insertSelective(Yu record);

    List<Yu> selectByExample(YuExample example);

    Yu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Yu record);

    int updateByPrimaryKey(Yu record);
}