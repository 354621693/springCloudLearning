package com.leemanshow.manshowShop.common.core.handler;

import com.leemanshow.manshowShop.common.core.context.BizHandlerContext;

/**
 * @author leewencan
 * @date 2022/7/29 15:18
 */
public interface BizHandler {
    boolean isAsync();
    boolean handle(BizHandlerContext context);
}
