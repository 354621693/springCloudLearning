package com.leemanshow.manshowshop.products.service;

import com.leemanshow.api.products.vo.GoodsStockVO;
import com.leemanshow.manshowShop.common.response.ServerResponseVO;

import java.util.List;

/**
 * @author leewencan
 * @date 2022/7/31 22:23
 */
public interface GoodsService {
    ServerResponseVO<List<GoodsStockVO>> getGoodsStocksBySkus(List<Integer> skus);
}
