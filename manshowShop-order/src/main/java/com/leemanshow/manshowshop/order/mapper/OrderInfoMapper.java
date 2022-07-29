package com.leemanshow.manshowshop.order.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leemanshow.manshowshop.order.entity.OrderInfo;

import java.util.List;

public interface OrderInfoMapper extends BaseMapper<OrderInfo> {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderInfo record);

    OrderInfo selectByPrimaryKey(Integer id);

    List<OrderInfo> selectAll();

    int updateByPrimaryKey(OrderInfo record);
}