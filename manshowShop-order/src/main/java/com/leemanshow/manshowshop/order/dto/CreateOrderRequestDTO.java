package com.leemanshow.manshowshop.order.dto;

import com.leemanshow.manshowShop.common.request.ServerRequestDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author leewencan
 * @date 2022/7/29 14:27
 */
@Data
public class CreateOrderRequestDTO extends ServerRequestDTO {
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
