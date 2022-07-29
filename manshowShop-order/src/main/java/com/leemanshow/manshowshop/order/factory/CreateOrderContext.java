package com.leemanshow.manshowshop.order.factory;

import com.leemanshow.manshowShop.common.core.context.AbstractHandlerContext;
import lombok.Data;

/**
 * @author leewencan
 * @date 2022/7/29 14:29
 */
@Data
public class CreateOrderContext extends AbstractHandlerContext {
    int orderId;
    int addressId;
    int deliveryType;
    int amount;
    int status;
    int userId;
}
