package com.yj.oep.mapper;

import com.yj.oep.entity.ConstsSiteCarousel;

public interface ConstsSiteCarouselMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ConstsSiteCarousel record);

    int insertSelective(ConstsSiteCarousel record);

    ConstsSiteCarousel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ConstsSiteCarousel record);

    int updateByPrimaryKey(ConstsSiteCarousel record);
}