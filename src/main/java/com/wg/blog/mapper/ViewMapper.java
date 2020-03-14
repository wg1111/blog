package com.wg.blog.mapper;

import com.wg.blog.model.View;

public interface ViewMapper {
    int deleteByPrimaryKey(Long id);

    int insert(View record);

    int insertSelective(View record);

    View selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(View record);

    int updateByPrimaryKey(View record);
}