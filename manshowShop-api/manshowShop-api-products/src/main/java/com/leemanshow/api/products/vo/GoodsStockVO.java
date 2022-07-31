package com.leemanshow.api.products.vo;

import lombok.Data;
import lombok.ToString;

/**
 * @author leewencan
 * @date 2022/7/30 17:29
 */
@Data
@ToString
public class GoodsStockVO {
    private int sku;
    private int stock;
}
