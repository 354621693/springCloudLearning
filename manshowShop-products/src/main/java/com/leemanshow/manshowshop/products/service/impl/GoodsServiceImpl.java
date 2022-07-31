package com.leemanshow.manshowshop.products.service.impl;

import com.leemanshow.api.products.vo.GoodsStockVO;
import com.leemanshow.manshowShop.common.response.ServerResponseVO;
import com.leemanshow.manshowshop.products.mapper.GoodsInfoMapper;
import com.leemanshow.manshowshop.products.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author leewencan
 * @date 2022/7/31 22:24
 */
@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    GoodsInfoMapper mapper;

    @Override
    public ServerResponseVO<List<GoodsStockVO>> getGoodsStocksBySkus(List<Integer> skus) {
        List<GoodsStockVO> list = mapper.getStocksBySkus(skus);
        return ServerResponseVO.success(list);
    }
}
