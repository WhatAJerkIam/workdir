package yj.spring.template.aop;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * @author yangjun3 ump报警AOP注解
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface UmpProfile {

//    EmUmpKey appName();
//
//    EmUmpKey key();

//    boolean enableHeartbeat() default false;
//
//    boolean enableTp() default true;

}
