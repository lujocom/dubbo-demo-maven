package com.luohui.dubbo.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <dl>
 * <dt>dubbo-demo-maven</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2015</dd>
 * <dd>Company: 北京青牛风科技有限公司</dd>
 * <dd>CreateDate: 2016年05月04日</dd>
 * </dl>
 *
 * @author LuoHui
 */
public class DubboRegist {
    private static final Log log = LogFactory.getLog(DubboRegist.class);

    public static void main(String[] args) {
        try {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
            context.start();
        } catch (Exception e) {
            log.error("== DubboProvider context start error:",e);
        }
        synchronized (DubboRegist.class) {
            while (true) {
                try {
                    DubboRegist.class.wait();
                } catch (InterruptedException e) {
                    log.error("== synchronized error:",e);
                }
            }
        }

    }

}
