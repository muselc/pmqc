package com.zust.dao.User;

import com.zust.dao.User.bean.TaskList;
import com.zust.dao.User.bean.TaskListExample;
import java.util.List;

public interface TaskListMapper {
    int deleteByExample(TaskListExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TaskList record);

    int insertSelective(TaskList record);

    List<TaskList> selectByExample(TaskListExample example);

    TaskList selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TaskList record);

    int updateByPrimaryKey(TaskList record);
}