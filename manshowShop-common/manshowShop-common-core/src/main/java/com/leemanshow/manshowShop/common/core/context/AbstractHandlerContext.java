package com.leemanshow.manshowShop.common.core.context;

import com.leemanshow.manshowShop.common.core.convert.TransConvert;
import lombok.Data;

/**
 * @author leewencan
 * @date 2022/7/29 14:21
 */
@Data
public abstract class AbstractHandlerContext implements BizHandlerContext {
    private TransConvert convert = null;
}
