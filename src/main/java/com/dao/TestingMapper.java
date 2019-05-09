package com.dao;

import java.util.List;

import model.Subject;
import model.Testing;
import model.TestingExample;
import org.apache.ibatis.annotations.Param;

public interface TestingMapper extends BaseDao<Testing>{
    long countByExample(TestingExample example);

    int deleteByExample(TestingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Testing record);

    int insertSelective(Testing record);

    List<Testing> selectByExample(TestingExample example);

    Testing selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Testing record, @Param("example") TestingExample example);

    int updateByExample(@Param("record") Testing record, @Param("example") TestingExample example);

    int updateByPrimaryKeySelective(Testing record);

    int updateByPrimaryKey(Testing record);
}