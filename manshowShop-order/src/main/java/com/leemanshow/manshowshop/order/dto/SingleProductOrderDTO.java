package com.leemanshow.manshowshop.order.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

/**
 * @author leewencan
 * @date 2022/7/28 15:00
 */
@Data
@ToString
public class SingleProductOrderDTO {

    /**
     * spuid
     */
    @NotBlank(message = "商品spu不能为空")
    @ApiModelProperty(value = "spu", required = true)
    private String spuId;

    /**
     * 商品id
     */
    @ApiModelProperty(value = "商品id", required = true)
    @NotBlank(message = "商品id不能为空")
    private String skuId;

    @Min(value = 1, message = "商品数量不能为空")
    @ApiModelProperty(value = "数量", required = true)
    private Integer count;

    @ApiModelProperty(value = "商铺id", required = true)
    @NotBlank(message = "商铺不能为空")
    private Integer shopId;

}
