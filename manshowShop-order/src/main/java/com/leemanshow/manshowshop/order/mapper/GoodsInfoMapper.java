package com.leemanshow.manshowshop.order.mapper;

import com.leemanshow.manshowshop.order.entity.GoodsInfo;

import java.util.List;

public interface GoodsInfoMapper {
    int deleteByPrimaryKey(Integer sku);

    int insert(GoodsInfo record);

    GoodsInfo selectByPrimaryKey(Integer sku);

    List<GoodsInfo> selectAll();

    int updateByPrimaryKey(GoodsInfo record);
}