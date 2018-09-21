package yj.spring.template.impl;

import javax.annotation.Resource;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.ibatis.session.RowBounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.Page;

import yj.spring.template.api.IHelloService;
import yj.spring.template.dao.mappers.FundAutoTradeMapper;
import yj.spring.template.dao.model.FundAutoTrade;

import java.io.IOException;

//@Service
@Controller
public class HelloServiceImpl implements IHelloService {
    Logger logger = LoggerFactory.getLogger(IHelloService.class);

    @Resource
    private FundAutoTradeMapper fundAutoTradeMapper;

    @ResponseBody
    @RequestMapping(value = "hello/{to}")
    @Override
    public String hello(@PathVariable("to") String to) {
        return "hello " + to;
    }

    // @Override
    // public Object getTradeByTrade(Long tradeId) {
    // // TODO Auto-generated method stub
    // return null;
    // }

    @ResponseBody
    @RequestMapping(value = "trade/{id}")
    @Override
    public Object getTradeByTrade(@PathVariable("id") Long tradeId) {

        Page<FundAutoTrade> trade = fundAutoTradeMapper.selectByPage(new RowBounds(0, 10));
        logger.info(ToStringBuilder.reflectionToString(trade));
        return trade;
    }


}
