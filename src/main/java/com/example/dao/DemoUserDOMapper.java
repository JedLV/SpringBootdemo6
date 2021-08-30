package com.example.dao;

import com.example.entity.DemoUserDO;

public interface DemoUserDOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DemoUserDO record);

    int insertSelective(DemoUserDO record);

    DemoUserDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DemoUserDO record);

    int updateByPrimaryKey(DemoUserDO record);
}