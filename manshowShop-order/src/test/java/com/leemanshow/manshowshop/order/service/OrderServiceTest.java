package com.leemanshow.manshowshop.order.service;

import com.leemanshow.manshowShop.common.securty.AuthUserContext;
import com.leemanshow.manshowShop.common.securty.bo.AuthUserTokenBO;
import com.leemanshow.manshowshop.order.dto.CreateOrderRequestDTO;
import com.leemanshow.manshowshop.order.dto.SingleProductOrderDTO;
import com.leemanshow.manshowshop.order.vo.OrderCreateVO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;

/**
 * @author leewencan
 * @date 2022/8/2 11:17
 */
@SpringBootTest
class OrderServiceTest {
    @Autowired
    OrderService orderService;

    @BeforeEach
    public void init() {
        AuthUserTokenBO authUserTokenBO = new AuthUserTokenBO();
        authUserTokenBO.setUserId(1);
        authUserTokenBO.setUserName("manshow!");
        AuthUserContext.set(authUserTokenBO);
    }

    @Test
    public void orderCreateTest() {
        CreateOrderRequestDTO createOrderRequestDTO = new CreateOrderRequestDTO();
        SingleProductOrderDTO singleProductOrderDTO = new SingleProductOrderDTO();
        singleProductOrderDTO.setCount(1);
        singleProductOrderDTO.setShopId(1);
        singleProductOrderDTO.setSkuId(1);
        singleProductOrderDTO.setSpuId(1);
        createOrderRequestDTO.setProductOrderDTO(Collections.singletonList(singleProductOrderDTO));
        createOrderRequestDTO.setAddressId(1);
        createOrderRequestDTO.setDeliveryType(1);
        OrderCreateVO order = orderService.createOrder(createOrderRequestDTO);
        System.out.println(order);
    }
}