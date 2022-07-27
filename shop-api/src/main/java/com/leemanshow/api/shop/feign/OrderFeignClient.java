package com.leemanshow.api.shop.feign;

import com.leemanshow.api.shop.vo.OrderAmountVO;
import org.springframework.cloud.openfeign.FeignClient;
import response.ServerResponseVO;

import java.util.List;

/**
 * @author leewencan
 * @date 2022/7/25 21:41
 */
@FeignClient(name = "shop-order",contextId = "order")
public interface OrderFeignClient {

    ServerResponseVO<OrderAmountVO> getOrderList(List<Integer> orderIds);
}
