package com.leemanshow.manshowshop.products.mapper;


import com.leemanshow.api.products.vo.GoodsStockVO;
import com.leemanshow.manshowshop.products.entity.GoodsInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsInfoMapper {
    int deleteByPrimaryKey(Integer sku);

    int insert(GoodsInfo record);

    GoodsInfo selectByPrimaryKey(Integer sku);

    List<GoodsInfo> selectAll();

    int updateByPrimaryKey(GoodsInfo record);

    List<GoodsStockVO> getStocksBySkus(@Param("skus") List<Integer> skus);
}