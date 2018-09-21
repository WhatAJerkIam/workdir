package yj.spring.template.bean;

public interface IMQProcessor {

    /**
     * 
     * 这个方法返回任意数字 即代表处理成功<br>
     * 需要重试只需抛出异常<br>
     * 
     * @param model
     * @return
     * @throws Exception
     */
    int process(MQModel model) throws Exception;
}
