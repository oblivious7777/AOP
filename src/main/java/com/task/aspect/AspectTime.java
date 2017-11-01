package com.task.aspect;


import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect //注解表示这是一个切面
@Component //表示这是一个bean,由Spring进行管理
public class AspectTime {
    static Logger logger = Logger.getLogger(AspectTime.class);

    @Around(value = "execution(* com.task.controller.CategoryController(..))")
    public Object listLog(ProceedingJoinPoint joinpoint) {
        Object result = null;
        try {
            long start = System.currentTimeMillis();
            result = joinpoint.proceed();
            long end = System.currentTimeMillis();
            System.out.println("调用了CONTRROLLER" + "   共耗时" + (end - start) + " 毫秒");
        } catch (Throwable t) {
            logger.error("出错");
        }
        return result;
    }


    @Around(value = "execution(* com.task.dao.CategoryMapper.list(..))")
    public Object list(ProceedingJoinPoint joinpoint) {
        Object result = null;
        try {
            long start = System.currentTimeMillis();
            result =  joinpoint.proceed();
            long end = System.currentTimeMillis();
            System.out.print("调用DB" + "   共耗时"+(end - start) + " 毫秒");
        } catch (Throwable t) {
            logger.error("出错");
        }
        return result;
    }
}
