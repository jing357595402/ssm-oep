package com.yj.oep.mapper;

import com.yj.oep.entity.ConstsCollege;

public interface ConstsCollegeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ConstsCollege record);

    int insertSelective(ConstsCollege record);

    ConstsCollege selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ConstsCollege record);

    int updateByPrimaryKey(ConstsCollege record);
}