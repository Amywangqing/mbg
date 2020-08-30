package com.qingfeng.mapper;

import com.qingfeng.pojo.TCart;

public interface TCartMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TCart record);

    int insertSelective(TCart record);

    TCart selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TCart record);

    int updateByPrimaryKey(TCart record);
}