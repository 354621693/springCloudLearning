package com.leemanshow.manshowshop.order.service;

import com.leemanshow.manshowshop.order.dto.CreateOrderRequestDTO;
import com.leemanshow.manshowshop.order.vo.OrderCreateVO;

/**
 * @author leewencan
 * @date 2022/7/29 22:06
 */
public interface OrderService {
    OrderCreateVO createOrder(CreateOrderRequestDTO orderDTO);
}
