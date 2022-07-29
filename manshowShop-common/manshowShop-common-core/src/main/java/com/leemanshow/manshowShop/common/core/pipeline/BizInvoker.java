package com.leemanshow.manshowShop.common.core.pipeline;

import com.leemanshow.manshowShop.common.core.context.BizHandlerContext;

/**
 * @author leewencan
 * @date 2022/7/29 10:42
 */
public interface BizInvoker {

    void start();

    void shutdown();

    <T extends BizHandlerContext> T getContext();
}
