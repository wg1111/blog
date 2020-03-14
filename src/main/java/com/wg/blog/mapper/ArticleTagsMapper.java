package com.wg.blog.mapper;

import com.wg.blog.model.ArticleTags;

public interface ArticleTagsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ArticleTags record);

    int insertSelective(ArticleTags record);

    ArticleTags selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ArticleTags record);

    int updateByPrimaryKey(ArticleTags record);
}