package com.leemanshow.manshowshop.order.mapper;

import com.leemanshow.manshowshop.order.entity.ProductsInfo;

import java.util.List;

public interface ProductsInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProductsInfo record);

    ProductsInfo selectByPrimaryKey(Integer id);

    List<ProductsInfo> selectAll();

    int updateByPrimaryKey(ProductsInfo record);
}