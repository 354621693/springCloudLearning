package com.leemanshow.manshowshop.order;

import com.leemanshow.manshowshop.order.entity.OrderInfo;
import com.leemanshow.manshowshop.order.mapper.OrderInfoMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author leewencan
 * @date 2022/7/25 21:13
 */
@SpringBootTest
class OrderInfoMapperTest {

    @Autowired
    OrderInfoMapper mapper;

    @Test
    void selectAll() {
        List<OrderInfo> orderInfos = mapper.selectAll();
        List<OrderInfo> orderInfos1 = mapper.selectList(null);
    }
}