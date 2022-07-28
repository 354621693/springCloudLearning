package com.leemanshow.manshowshop.order.controller;

import com.leemanshow.manshowShop.common.response.ServerResponseVO;
import com.leemanshow.manshowshop.order.dto.OrderDTO;
import com.leemanshow.manshowshop.order.vo.OrderCreateVO;
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

    /**
     *          //1、检查库存
     *         //2、生成订单
     *         //3、清除购物车
     *         //4、发送短信
     *         //5、加入延迟队列，超时取消订单
     * @param orderDTO
     * @return
     */
    @PostMapping("/createOrder")
    public ServerResponseVO<OrderCreateVO> createOrder(@Valid @RequestBody OrderDTO orderDTO){
        return null;
    }
}
