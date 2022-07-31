package com.leemanshow.api.products.feign;

import com.leemanshow.api.products.vo.GoodsStockVO;
import com.leemanshow.manshowShop.common.response.ServerResponseVO;
import org.springframework.cloud.openfeign.FeignClient;

import java.util.List;

/**
 * @author leewencan
 * @date 2022/7/25 21:41
 */
@FeignClient(name = "shop-products", contextId = "products")
public interface ProductsFeignClient {
    ServerResponseVO<List<GoodsStockVO>> getProductsStock(List<Integer> productsId);
}
