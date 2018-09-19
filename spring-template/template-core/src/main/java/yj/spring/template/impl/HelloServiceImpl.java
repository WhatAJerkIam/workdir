package yj.spring.template.impl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import yj.spring.template.api.IHelloService;

//@Service
@Controller
@RequestMapping(value = "hello")
public class HelloServiceImpl implements IHelloService {

    @ResponseBody
    @RequestMapping(value="{to}")
    @Override public String hello(@PathVariable("to") String to) {
        return "hello "+to;
    }
}
