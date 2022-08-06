package com.leemanshow.manshowshop.order.vo;

import com.leemanshow.manshowShop.common.response.vo.ServerBaseVO;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author leewencan
 * @date 2022/7/28 11:38
 */
@ToString
@Data
public class OrderCreateVO implements ServerBaseVO {
    private int orderId;
}
