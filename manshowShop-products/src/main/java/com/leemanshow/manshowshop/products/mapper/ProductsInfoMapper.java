package com.leemanshow.manshowshop.products.mapper;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leemanshow.api.products.vo.GoodsStockVO;
import com.leemanshow.manshowshop.products.entity.ProductsInfo;

import java.util.List;

public interface ProductsInfoMapper extends BaseMapper<ProductsInfo> {
    int deleteByPrimaryKey(Integer id);

    int insert(ProductsInfo record);

    ProductsInfo selectByPrimaryKey(Integer id);

    List<ProductsInfo> selectAll();

    int updateByPrimaryKey(ProductsInfo record);

    List<GoodsStockVO> selectList(QueryWrapper<GoodsStockVO> id);
}