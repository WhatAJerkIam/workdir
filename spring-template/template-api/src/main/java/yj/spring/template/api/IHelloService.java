package yj.spring.template.api;

import yj.spring.template.req.ValidReq;

public interface IHelloService {

    public String hello(String to);

    public Object getTradeByTrade(String tradeId);

    public Object getTradeByTrade(ValidReq req);
}
