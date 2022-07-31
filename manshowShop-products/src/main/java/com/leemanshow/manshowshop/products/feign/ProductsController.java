package com.leemanshow.manshowshop.products.feign;

import com.leemanshow.api.products.feign.ProductsFeignClient;
import com.leemanshow.api.products.vo.GoodsStockVO;
import com.leemanshow.manshowShop.common.response.ServerResponseVO;
import com.leemanshow.manshowshop.products.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author leewencan
 * @date 2022/7/31 21:37
 */
@RestController
public class ProductsController implements ProductsFeignClient {
    @Autowired
    ProductsService productsService;
    @Override
    public ServerResponseVO<List<GoodsStockVO>> getProductsStock(List<Integer> productsId) {
        return productsService.getProductsStock(productsId);
    }
}
