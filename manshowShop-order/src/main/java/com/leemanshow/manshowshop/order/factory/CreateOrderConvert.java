package com.leemanshow.manshowshop.order.factory;

import com.leemanshow.manshowShop.common.core.context.BizHandlerContext;
import com.leemanshow.manshowShop.common.core.convert.TransConvert;
import com.leemanshow.manshowShop.common.response.vo.ServerBaseVO;
import com.leemanshow.manshowshop.order.vo.OrderCreateVO;

/**
 * @author leewencan
 * @date 2022/7/29 22:31
 */
public class CreateOrderConvert implements TransConvert {
    @Override
    public ServerBaseVO convertToResponse(BizHandlerContext context) {
        CreateOrderContext orderContext = (CreateOrderContext) context;
        OrderCreateVO result = new OrderCreateVO();
        result.setOrderId(orderContext.getOrderId());
        return result;
    }
}
