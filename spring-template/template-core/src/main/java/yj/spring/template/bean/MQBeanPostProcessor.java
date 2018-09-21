package yj.spring.template.bean;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Component;

@Component
public class MQBeanPostProcessor implements BeanPostProcessor, ApplicationContextAware {
    private ApplicationContext applicationContext;
    private Map<EmMissionType, IMQProcessor> processMap = new HashMap<>();

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (isImplementInterface(bean.getClass(), IMQProcessor.class)) {
            MQProcess mq = AnnotationUtils.findAnnotation(bean.getClass(), MQProcess.class);
            if (mq != null) {
                processMap.put(mq.missionType(), (IMQProcessor) bean);
            }
        }
        return bean;
    }

    private boolean isImplementInterface(Class clazz, Class intf) {
        return intf.isAssignableFrom(clazz);
    }

    public IMQProcessor getProcessor(EmMissionType type) {
        return processMap.get(type);
    }
}
