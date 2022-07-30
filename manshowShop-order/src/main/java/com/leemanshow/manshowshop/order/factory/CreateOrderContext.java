package com.leemanshow.manshowshop.order.factory;

import com.leemanshow.manshowShop.common.core.context.AbstractHandlerContext;
import com.leemanshow.manshowshop.order.dto.SingleProductOrderDTO;
import lombok.Data;

import java.util.List;

/**
 * @author leewencan
 * @date 2022/7/29 14:29
 */
@Data
public class CreateOrderContext extends AbstractHandlerContext {
    private List<SingleProductOrderDTO> productOrderDTO;
    private int orderId;
    private int addressId;
    private int deliveryType;
    private int amount;
    private int status;
    private int userId;
}
