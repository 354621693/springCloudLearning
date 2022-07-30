package com.leemanshow.manshowshop.order.mapper;

import com.leemanshow.manshowshop.order.entity.ShopInfo;

import java.util.List;

public interface ShopInfoMapper {
    int deleteByPrimaryKey(Integer shopId);

    int insert(ShopInfo record);

    ShopInfo selectByPrimaryKey(Integer shopId);

    List<ShopInfo> selectAll();

    int updateByPrimaryKey(ShopInfo record);
}