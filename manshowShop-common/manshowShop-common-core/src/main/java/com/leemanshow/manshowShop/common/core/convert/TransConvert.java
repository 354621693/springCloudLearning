package com.leemanshow.manshowShop.common.core.convert;

import com.leemanshow.manshowShop.common.core.context.BizHandlerContext;
import com.leemanshow.manshowShop.common.response.vo.ServerBaseVO;

/**
 * @author leewencan
 * @date 2022/7/29 14:23
 */
public interface TransConvert {
    ServerBaseVO convertToResponse(BizHandlerContext context);
}
