package yj.spring.template.req;

import javax.validation.constraints.NotNull;

public class ValidReq {

    @NotNull
   private String tradeNo;

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }
}
