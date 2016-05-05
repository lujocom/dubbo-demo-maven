package com.luohui.dubbo.service;

import com.luohui.dubbo.api.ProductService;
import com.luohui.dubbo.mapper.ProductMapper;
import com.luohui.dubbo.po.Product;
import com.luohui.dubbo.po.ProductExample;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <dl>
 * <dt>dubo-demo</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2015</dd>
 * <dd>Company: 北京青牛风科技有限公司</dd>
 * <dd>CreateDate: 2016年04月20日</dd>
 * </dl>
 *
 * @author LuoHui
 */
@Service("productService")
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> getAllProduct() {
        ProductExample example = new ProductExample();
        example.createCriteria().andImgepathIsNotNull();
        return productMapper.selectByExample(example);
    }

    @Override
    public List<Product> getProducts(Product product) {
        ProductExample example = new ProductExample();
        ProductExample.Criteria criteria = example.createCriteria();
        if (ObjectUtils.notEqual(product, null)) {
            criteria.andPriceGreaterThan(product.getPrice());
        }
        criteria.andStatusEqualTo(1);
        return  productMapper.selectByExample(example);
    }


}
