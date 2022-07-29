package com.leemanshow.manshowShop.common.core.factory;

import com.leemanshow.manshowShop.common.core.context.AbstractHandlerContext;
import com.leemanshow.manshowShop.common.core.context.BizHandlerContext;
import com.leemanshow.manshowShop.common.core.convert.TransConvert;
import com.leemanshow.manshowShop.common.core.pipeline.BizInvoker;
import com.leemanshow.manshowShop.common.core.pipeline.BizPipeline;
import com.leemanshow.manshowShop.common.request.ServerRequestDTO;

/**
 * @author leewencan
 * @date 2022/7/29 10:50
 */
public abstract class AbstractDefaultPipelineFactory<T extends ServerRequestDTO> implements PipelineFactory<T> {


    @Override
    public final BizInvoker build(T obj) {
        AbstractHandlerContext context = (AbstractHandlerContext) createContext(obj);
        context.setConvert(createConvert());
        BizPipeline pipeline = (BizPipeline) createPipeline(context);
        doBuild(pipeline);
        return pipeline;
    }

    protected abstract TransConvert createConvert();

    private BizInvoker createPipeline(BizHandlerContext context) {
        return new DefaultPipeline(context);
    }

    protected abstract void doBuild(BizPipeline pipeline);

    protected abstract BizHandlerContext createContext(T obj);

}
