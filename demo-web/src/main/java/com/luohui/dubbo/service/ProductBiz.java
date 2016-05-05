package com.luohui.dubbo.service;

import com.luohui.dubbo.api.ProductService;
import com.luohui.dubbo.po.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <dl>
 * <dt>dubbo-demo-maven</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2015</dd>
 * <dd>Company: 北京青牛风科技有限公司</dd>
 * <dd>CreateDate: 2016年05月05日</dd>
 * </dl>
 *
 * @author LuoHui
 */
@Service("productBiz")
public class ProductBiz {

    @Autowired
    private ProductService productService;

    public List<Product> getAllProduct (){
        return productService.getAllProduct();
    }

    public List<Product> getProduct(){
        Product product = new Product();
        product.setPrice(10.0f);
        return productService.getProducts(product);
    }

}
