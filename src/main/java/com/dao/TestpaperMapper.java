package com.dao;

import com.model.Testpaper;

public interface TestpaperMapper extends BaseDao<Testpaper>{
    int deleteByPrimaryKey(String id);

    int insert(Testpaper record);

    int insertSelective(Testpaper record);

    Testpaper selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Testpaper record);

    int updateByPrimaryKey(Testpaper record);
}