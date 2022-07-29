package com.leemanshow.manshowshop.order.service.impl;

import com.leemanshow.manshowShop.common.core.context.AbstractHandlerContext;
import com.leemanshow.manshowShop.common.core.context.BizHandlerContext;
import com.leemanshow.manshowShop.common.core.convert.TransConvert;
import com.leemanshow.manshowShop.common.core.pipeline.BizInvoker;
import com.leemanshow.manshowshop.order.dto.CreateOrderRequestDTO;
import com.leemanshow.manshowshop.order.factory.OrderPipelineFactory;
import com.leemanshow.manshowshop.order.service.OrderService;
import com.leemanshow.manshowshop.order.vo.OrderCreateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author leewencan
 * @date 2022/7/29 22:07
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderPipelineFactory orderPipelineFactory;
    @Override
    public OrderCreateVO createOrder(CreateOrderRequestDTO orderDTO) {
        BizInvoker build = orderPipelineFactory.build(orderDTO);
        build.start();
        AbstractHandlerContext context = build.getContext();
        TransConvert convert = context.getConvert();
        Object o = convert.convertToResponse(context);
        return null;
    }
}
