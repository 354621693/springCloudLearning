package com.leemanshow.api.products.feign;

import com.leemanshow.api.products.vo.GoodsStockVO;
import com.leemanshow.manshowShop.common.response.ServerResponseVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

import static com.leemanshow.manshowShop.common.feign.FeignConfig.FEIGN_INSIDE_URL_PREFIX;

/**
 * @author leewencan
 * @date 2022/7/25 21:41
 */
@FeignClient(name = "shop-goods", contextId = "goods")
public interface GoodsFeignClient {
    @GetMapping(value = FEIGN_INSIDE_URL_PREFIX + "/getGoodsStocks")
    ServerResponseVO<List<GoodsStockVO>> getGoodsStock(List<Integer> skus);
}
