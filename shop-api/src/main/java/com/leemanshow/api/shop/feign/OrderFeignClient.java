package com.leemanshow.api.shop.feign;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author leewencan
 * @date 2022/7/25 21:41
 */
@FeignClient(name = "shop-order",contextId = "order")
public interface OrderFeignClient {
    ShopResponseVO<>
}
