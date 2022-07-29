package com.leemanshow.manshowshop.order.mapper;

import com.leemanshow.manshowshop.order.entity.CartInfo;

import java.util.List;

public interface CartInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CartInfo record);

    CartInfo selectByPrimaryKey(Integer id);

    List<CartInfo> selectAll();

    int updateByPrimaryKey(CartInfo record);
}