package com.leemanshow.manshowshop.products.service.impl;

import com.leemanshow.api.products.vo.GoodsStockVO;
import com.leemanshow.manshowShop.common.response.ServerResponseVO;
import com.leemanshow.manshowshop.products.service.GoodsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

/**
 * @author leewencan
 * @date 2022/7/31 22:33
 */
@SpringBootTest
class GoodsServiceImplTest {
    @Autowired
    GoodsService service;

    @Test
    void getGoodsStocksBySkus() {
        ServerResponseVO<List<GoodsStockVO>> goodsStocksBySkus = service.getGoodsStocksBySkus(Arrays.asList(1, 2));
        System.out.println(goodsStocksBySkus);
    }
}