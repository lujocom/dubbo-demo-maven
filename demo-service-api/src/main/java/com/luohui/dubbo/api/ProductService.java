package com.luohui.dubbo.api;

import com.luohui.dubbo.po.Product;

import java.util.List;

/**
 * <dl>
 * <dt>dubbo-demo-maven</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2015</dd>
 * <dd>Company: 北京青牛风科技有限公司</dd>
 * <dd>CreateDate: 2016年05月03日</dd>
 * </dl>
 *
 * @author LuoHui
 */
public interface ProductService {
    List<Product> getAllProduct();

    List<Product> getProducts(Product product);
}
