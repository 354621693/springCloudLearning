package com.leemanshow.manshowshop.order.controller;

import com.leemanshow.manshowShop.common.response.ServerResponseVO;
import com.leemanshow.manshowshop.order.dto.CreateOrderRequestDTO;
import com.leemanshow.manshowshop.order.factory.OrderPipelineFactory;
import com.leemanshow.manshowshop.order.service.OrderService;
import com.leemanshow.manshowshop.order.vo.OrderCreateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author leewencan
 * @date 2022/7/28 9:36
 */
@RestController("/shop/order")
public class OrderController {

    @Autowired
    OrderPipelineFactory orderPipelineFactory;

    @Autowired
    OrderService orderService;

    /**
     * @param orderDTO
     * @return
     */
    @PostMapping("/createOrder")
    public ServerResponseVO<OrderCreateVO> createOrder(@Valid @RequestBody CreateOrderRequestDTO orderDTO) {
        OrderCreateVO orderCreateVO = orderService.createOrder(orderDTO);
        return ServerResponseVO.success(orderCreateVO);
    }
}
