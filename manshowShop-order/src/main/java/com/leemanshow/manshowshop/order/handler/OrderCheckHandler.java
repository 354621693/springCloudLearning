package com.leemanshow.manshowshop.order.handler;

import com.leemanshow.api.products.feign.GoodsFeignClient;
import com.leemanshow.manshowShop.common.core.context.BizHandlerContext;
import com.leemanshow.manshowShop.common.core.handler.AbstractHandler;
import com.leemanshow.manshowshop.order.dto.SingleProductOrderDTO;
import com.leemanshow.manshowshop.order.factory.CreateOrderContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author leewencan
 * @date 2022/7/29 17:04
 */
@Service
public class OrderCheckHandler extends AbstractHandler {

    @Autowired
    GoodsFeignClient goodsFeignClient;

    @Override
    public boolean handle(BizHandlerContext context) {
        CreateOrderContext orderContext = (CreateOrderContext) context;
        List<SingleProductOrderDTO> productOrderDTO = orderContext.getProductOrderDTO();
        return false;
    }
}
