package com.zheng.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;//Spring 自带的日志查询工具
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;


/**
 * Created by 18362 on 2017/10/10.
 */
@Aspect
@Component
public class HttpAspect {
    // @Before("execution(public * com.zheng.Controller.girlController.getGirlsList(..))")
   //@Before("execution(public * com.zheng.Controller.girlController.*(..))")，报下的所有方法
    private final static Logger logger=LoggerFactory.getLogger(HttpAspect.class);
    @Pointcut("execution(public * com.zheng.Controller.girlController.*(..))")//使用切点统一配置切面
    public void log()
    {

    }
    @Before("log()")
    public void beforelog(JoinPoint joinPoint)//哪个函数执行了当前的切面编程
    {
        ServletRequestAttributes requestAttributes= (ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
        HttpServletRequest request=requestAttributes.getRequest();
        logger.info("url={}",request.getRequestURL());
        logger.info("method={}",request.getMethod());
        logger.info("ip={}",request.getRemoteAddr());
        logger.info("class_method={}",joinPoint.getSignature().getDeclaringTypeName()+" "+joinPoint.getSignature().getName());
        logger.info("args={}",joinPoint.getArgs());//有意思的操作

        //logger.info("日子记录");
       // System.out.println("日志记录");
    }
    @After("log()")
    public void doafer()
    {
        logger.info("执行后");
        //System.out.println("切面执行后");
    }
    @AfterReturning(returning = "object",pointcut = "log()")//AfterReturning 正确返回效果之后
    public void afterreturning(Object object)
    {
        logger.info("response={}",object.toString());
    }
}
