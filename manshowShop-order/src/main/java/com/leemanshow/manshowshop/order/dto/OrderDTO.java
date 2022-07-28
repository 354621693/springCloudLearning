package com.leemanshow.manshowshop.order.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author leewencan
 * @date 2022/7/28 11:43
 */
@Data
@ToString
public class OrderDTO {
    @ApiModelProperty("立即购买时的商品信息项")
    @Valid
    List<SingleProductOrderDTO> productOrderDTO;

    @NotNull(message = "配送类型不能为空")
    @ApiModelProperty(value = "地址id", required = true)
    private Integer deliveryType;

    @NotNull(message = "地址id不能为空")
    @ApiModelProperty(value = "地址id", required = true)
    private Integer addressId;
}
