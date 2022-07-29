package com.leemanshow.manshowShop.common.core.factory;

import com.leemanshow.manshowShop.common.core.context.BizHandlerContext;
import com.leemanshow.manshowShop.common.core.handler.BizHandler;
import com.leemanshow.manshowShop.common.core.pipeline.BizPipeline;

/**
 * @author leewencan
 * @date 2022/7/29 15:13
 */
public class DefaultPipeline implements BizPipeline {

    BizHandlerNode tail;

    BizHandlerNode head = new BizHandlerNode();

    BizHandlerContext context;

    public DefaultPipeline(BizHandlerContext context) {
        this.context = context;
        tail = head;
    }

    @Override
    public void start() {
        head.getNext().exec(getContext());
    }

    @Override
    public void shutdown() {

    }

    @Override
    public <T extends BizHandlerContext> T getContext() {
        return (T) this.context;
    }

    @Override
    public void addFirst(BizHandler handler) {

    }

    @Override
    public void addLast(BizHandler handler) {
        BizHandlerNode node = new BizHandlerNode(handler);
        tail.setNext(node);
        tail = node;
    }
}
