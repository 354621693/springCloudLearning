package com.leemanshow.manshowshop.order.handler;

import com.leemanshow.manshowShop.common.core.context.BizHandlerContext;
import com.leemanshow.manshowShop.common.core.handler.AbstractHandler;
import org.springframework.stereotype.Service;

/**
 * @author leewencan
 * @date 2022/7/29 17:04
 */
@Service
public class OrderCheckHandler extends AbstractHandler {

    @Override
    public boolean handle(BizHandlerContext context) {
        return false;
    }
}
