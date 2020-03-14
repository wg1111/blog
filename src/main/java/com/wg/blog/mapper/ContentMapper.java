package com.wg.blog.mapper;

import com.wg.blog.model.Content;
import com.wg.blog.model.ContentWithBLOBs;

public interface ContentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ContentWithBLOBs record);

    int insertSelective(ContentWithBLOBs record);

    ContentWithBLOBs selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ContentWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ContentWithBLOBs record);

    int updateByPrimaryKey(Content record);
}