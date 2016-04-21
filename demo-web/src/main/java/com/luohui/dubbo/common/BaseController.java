package com.luohui.dubbo.common;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.context.ServletContextAware;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
public  class BaseController implements ServletContextAware {
    protected transient final Log logger = LogFactory.getLog(getClass());

    private String servletRealPath;
    private String servletContextPath;
    private ServletContext servletContext;

    @Override
    public void setServletContext(ServletContext servletContext) {
        logger.debug(">>>>>>>>>>>>>>>>>>>>>>setServletContext");
        this.servletContext = servletContext;
        this.servletRealPath = servletContext.getRealPath("/");
        this.servletContextPath = servletContext.getContextPath();
    }

    /**
     * 获取HttpSession
     *
     * @param request
     * @return
     */
    protected HttpSession getSession(HttpServletRequest request){
        return request.getSession();
    }

    /**
     * 获取servletContext
     *
     * @return
     */
    protected ServletContext getServletContext() {
        return servletContext;
    }

    /**
     * 获取项目所在的根路径
     *
     * @return
     */
    protected String getServletContextPath() {
        return servletContextPath;
    }

    public String getServletRealPath() {
        return servletRealPath;
    }

    public void setServletRealPath(String servletRealPath) {
        this.servletRealPath = servletRealPath;
    }
}
