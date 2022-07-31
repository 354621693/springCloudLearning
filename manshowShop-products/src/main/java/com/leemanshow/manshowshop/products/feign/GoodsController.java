package com.leemanshow.manshowshop.products.feign;

import com.leemanshow.api.products.feign.GoodsFeignClient;
import com.leemanshow.api.products.vo.GoodsStockVO;
import com.leemanshow.manshowShop.common.response.ServerResponseVO;
import com.leemanshow.manshowshop.products.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author leewencan
 * @date 2022/7/31 22:19
 */
@RestController
public class GoodsController implements GoodsFeignClient {
    @Autowired
    GoodsService goodsService;
    @Override
    public ServerResponseVO<List<GoodsStockVO>> getGoodsStock(List<Integer> skus) {
        return goodsService.getGoodsStocksBySkus(skus);
    }
}
