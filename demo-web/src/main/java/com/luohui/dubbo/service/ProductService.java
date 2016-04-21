package com.luohui.dubbo.service;

import com.google.common.collect.Maps;
import com.luohui.dubbo.mapper.ProductMapper;
import com.luohui.dubbo.po.ProductExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

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
@Service
public class ProductService {

    @Autowired
    private ProductMapper productMapper;

    public Map<String, Object> getAllProduct(){
        Map<String, Object> result = Maps.newHashMap();
        ProductExample example = new ProductExample();
        example.createCriteria().andImgepathIsNotNull();
        result.put("list", productMapper.selectByExample(example));
        return result;
    }




}
