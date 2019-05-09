package com.dao;

import java.util.List;

import model.Score;
import model.Sitedata;
import model.SitedataExample;
import org.apache.ibatis.annotations.Param;

public interface SitedataMapper extends BaseDao<Sitedata>{
    long countByExample(SitedataExample example);

    int deleteByExample(SitedataExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Sitedata record);

    int insertSelective(Sitedata record);

    List<Sitedata> selectByExample(SitedataExample example);

    Sitedata selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Sitedata record, @Param("example") SitedataExample example);

    int updateByExample(@Param("record") Sitedata record, @Param("example") SitedataExample example);

    int updateByPrimaryKeySelective(Sitedata record);

    int updateByPrimaryKey(Sitedata record);
}