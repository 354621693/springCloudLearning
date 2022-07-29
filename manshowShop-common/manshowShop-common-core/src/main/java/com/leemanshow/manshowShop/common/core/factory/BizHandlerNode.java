package com.leemanshow.manshowShop.common.core.factory;

import com.leemanshow.manshowShop.common.core.callback.BizCallback;
import com.leemanshow.manshowShop.common.core.context.BizHandlerContext;
import com.leemanshow.manshowShop.common.core.handler.AbstractHandler;
import com.leemanshow.manshowShop.common.core.handler.BizHandler;

/**
 * @author leewencan
 * @date 2022/7/29 15:40
 */
public class BizHandlerNode {
    private BizHandler handler;
    private BizHandlerNode next = null;

    public BizHandlerNode(BizHandler handler) {
        this.handler = handler;
    }

    public BizHandlerNode() {
    }

    public void setNext(BizHandlerNode next) {
        this.next = next;
    }

    public BizHandlerNode getNext() {
        return next;
    }

    public void exec(BizHandlerContext context) {
        boolean success;
        if (handler.isAsync()) {
            //线程池执行
            success = true;
        } else {
            success = handler.handle(context);
        }
        AbstractHandler abstractHandler = (AbstractHandler) this.handler;
        execCallBack(abstractHandler.getBizCallbacks(), context, null);
        if (success && this.next != null) {
            next.exec(context);
        }
    }

    private void execCallBack(BizCallback bizCallbacks, BizHandlerContext context, Throwable throwable) {
        if (bizCallbacks != null && throwable != null) {
            bizCallbacks.onDone(context);
        }
    }
}
