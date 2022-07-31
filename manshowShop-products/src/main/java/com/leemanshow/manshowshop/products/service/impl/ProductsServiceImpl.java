package com.leemanshow.manshowshop.products.service.impl;

import com.leemanshow.api.products.vo.GoodsStockVO;
import com.leemanshow.manshowShop.common.response.ServerResponseVO;
import com.leemanshow.manshowshop.products.mapper.ProductsInfoMapper;
import com.leemanshow.manshowshop.products.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author leewencan
 * @date 2022/7/31 21:40
 */
@Service
public class ProductsServiceImpl implements ProductsService {
    @Autowired
    ProductsInfoMapper mapper;

    @Override
    public ServerResponseVO<List<GoodsStockVO>> getProductsStock(List<Integer> productsId) {
        return null;
    }
}
