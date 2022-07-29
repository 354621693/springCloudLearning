package com.leemanshow.manshowshop.order.factory;

import com.leemanshow.manshowShop.common.core.context.BizHandlerContext;
import com.leemanshow.manshowShop.common.core.convert.TransConvert;
import com.leemanshow.manshowShop.common.core.factory.AbstractDefaultPipelineFactory;
import com.leemanshow.manshowShop.common.core.pipeline.BizPipeline;
import com.leemanshow.manshowShop.common.securty.AuthUserContext;
import com.leemanshow.manshowshop.order.dto.CreateOrderRequestDTO;
import com.leemanshow.manshowshop.order.handler.OrderCheckHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author leewencan
 * @date 2022/7/29 10:46
 */
@Component
public class OrderPipelineFactory extends AbstractDefaultPipelineFactory<CreateOrderRequestDTO> {

    @Autowired
    OrderCheckHandler orderCheckHandler;

    @Override
    protected TransConvert createConvert() {
        return new CreateOrderConvert();
    }

    @Override
    protected void doBuild(BizPipeline pipeline) {
        pipeline.addLast(orderCheckHandler);
    }

    @Override
    protected BizHandlerContext createContext(CreateOrderRequestDTO obj) {
        CreateOrderContext createOrderContext = new CreateOrderContext();
        createOrderContext.setUserId(AuthUserContext.get().getUserId());
        createOrderContext.setDeliveryType(obj.getDeliveryType());
        createOrderContext.setAddressId(obj.getAddressId());
        return createOrderContext;
    }
}
