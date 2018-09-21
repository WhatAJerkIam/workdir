package yj.spring.template.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class UmpAspect {

    @Pointcut("@annotation( yj.spring.template.aop.UmpProfile)")
    public void aspect() {
    }

    @Around(value = "aspect()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {

        try {
            return pjp.proceed();
        } catch (Throwable e) {

            throw e;
        } finally {

        }
    }

    private UmpProfile getUmpProfile(ProceedingJoinPoint pjp) {
        MethodSignature methodSignature = (MethodSignature) pjp.getSignature();
        Method targetMethod = methodSignature.getMethod();
        return targetMethod.getAnnotation(UmpProfile.class);
    }
}
