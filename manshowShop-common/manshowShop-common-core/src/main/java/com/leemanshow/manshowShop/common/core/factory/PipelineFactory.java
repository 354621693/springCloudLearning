package com.leemanshow.manshowShop.common.core.factory;

import com.leemanshow.manshowShop.common.core.pipeline.BizInvoker;

/**
 * @author leewencan
 * @date 2022/7/29 10:41
 */
public interface PipelineFactory<T> {
    BizInvoker build(T obj);
}
