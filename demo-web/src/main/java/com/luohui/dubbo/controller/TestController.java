package com.luohui.dubbo.controller;

import com.luohui.dubbo.common.BaseController;
import com.luohui.dubbo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * <dl>
 * <dt>dubbo-demo-maven</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2015</dd>
 * <dd>Company: </dd>
 * <dd>CreateDate: 2016年04月20日</dd>
 * </dl>
 *
 * @author LuoHui
 */
@RestController
@RequestMapping("/test")
public class TestController extends BaseController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/hello")
    public ModelAndView getHello(){
        ModelAndView mv = new ModelAndView("testPage");

        logger.debug("这是一个测试---debug");
        logger.info("这是一个测试---info");
        logger.error("这是一个测试---error");
        mv.addObject("ceshi", "hello, world");
        mv.addAllObjects(productService.getAllProduct());
        return mv;
    }

    @RequestMapping("/page")
    public String getTestPage(){
        return "testPage.html";
    }

}
