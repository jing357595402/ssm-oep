package com.yj.oep.mapper;

import com.yj.oep.entity.CourseComment;

public interface CourseCommentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CourseComment record);

    int insertSelective(CourseComment record);

    CourseComment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CourseComment record);

    int updateByPrimaryKey(CourseComment record);
}