package com.leemanshow.api.products.feign;

import com.leemanshow.api.products.vo.ProductStockVO;
import com.leemanshow.manshowShop.common.response.ServerResponseVO;
import org.springframework.cloud.openfeign.FeignClient;

import java.util.List;

/**
 * @author leewencan
 * @date 2022/7/25 21:41
 */
@FeignClient(name = "shop-products", contextId = "products")
public interface OrderFeignClient {
    ServerResponseVO<List<ProductStockVO>> getProductsStock(List<Integer> productsId);
}
