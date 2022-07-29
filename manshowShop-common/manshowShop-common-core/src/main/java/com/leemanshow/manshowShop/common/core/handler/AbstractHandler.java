package com.leemanshow.manshowShop.common.core.handler;

import com.leemanshow.manshowShop.common.core.callback.BizCallback;
import com.leemanshow.manshowShop.common.core.context.BizHandlerContext;

/**
 * @author leewencan
 * @date 2022/7/29 15:57
 */
public abstract class AbstractHandler implements BizHandler {
    private boolean isAsync;

    public BizCallback getBizCallbacks() {
        return null;
    }

    @Override
    public boolean isAsync() {
        return false;
    }
}
