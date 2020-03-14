package com.wg.blog.mapper;

import com.wg.blog.model.Pv;

public interface PvMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Pv record);

    int insertSelective(Pv record);

    Pv selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Pv record);

    int updateByPrimaryKey(Pv record);
}