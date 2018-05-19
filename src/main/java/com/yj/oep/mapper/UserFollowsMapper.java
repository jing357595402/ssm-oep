package com.yj.oep.mapper;

import com.yj.oep.entity.UserFollows;

public interface UserFollowsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserFollows record);

    int insertSelective(UserFollows record);

    UserFollows selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserFollows record);

    int updateByPrimaryKey(UserFollows record);
}