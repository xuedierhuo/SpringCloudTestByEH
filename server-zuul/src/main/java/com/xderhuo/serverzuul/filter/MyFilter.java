package com.xderhuo.serverzuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Component
public class MyFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        System.out.println("123123123121");
//        拿过来请求
        RequestContext ctx = RequestContext.getCurrentContext();
//        把http请求拿出来
        HttpServletRequest request = ctx.getRequest();
//        判断是不是存在token
        String token = request.getParameter("token");
        if (token == null){
//           直接返回结果
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            try {
                ctx.getResponse().getWriter().write("token is null");
            } catch (IOException e) {
            }
        }
        return null;
    }
}
