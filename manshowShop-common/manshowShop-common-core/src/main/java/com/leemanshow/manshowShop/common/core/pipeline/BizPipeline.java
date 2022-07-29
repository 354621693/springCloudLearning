package com.leemanshow.manshowShop.common.core.pipeline;

import com.leemanshow.manshowShop.common.core.handler.BizHandler;

/**
 * @author leewencan
 * @date 2022/7/29 15:14
 */
public interface BizPipeline extends BizInvoker {
    void addFirst(BizHandler handler);

    void addLast(BizHandler handler);
}
