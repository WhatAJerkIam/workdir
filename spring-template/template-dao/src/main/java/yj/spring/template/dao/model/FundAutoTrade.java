package yj.spring.template.dao.model;

import java.math.BigDecimal;
import java.util.Date;

public class FundAutoTrade {
    private Long id;

    private Integer systemId;

    private Long planId;

    private Long signId;

    private String jdPin;

    private String transId;

    private String customerNo;

    private Integer bizSeparateCode;

    private String merchantCode;

    private Integer channel;

    private String fundCode;

    private String serialNo;

    private BigDecimal tradeAmount;

    private Date bizDate;

    private Integer isRepeat;

    private Integer tradeStatus;

    private Integer payType;

    private BigDecimal tradePortion;

    private String tradeNo;

    private Date tradeApplyTime;

    private Date tradeConfirmTime;

    private Date predictConfirmTime;

    private String payNo;

    private Integer payStatus;

    private Date payConfirmTime;

    private String plOrderNo;

    private Integer frozenNeed;

    private Integer planType;

    private String remark;

    private Date createTime;

    private Date updateTime;

    private Integer yn;

    private Integer term;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSystemId() {
        return systemId;
    }

    public void setSystemId(Integer systemId) {
        this.systemId = systemId;
    }

    public Long getPlanId() {
        return planId;
    }

    public void setPlanId(Long planId) {
        this.planId = planId;
    }

    public Long getSignId() {
        return signId;
    }

    public void setSignId(Long signId) {
        this.signId = signId;
    }

    public String getJdPin() {
        return jdPin;
    }

    public void setJdPin(String jdPin) {
        this.jdPin = jdPin == null ? null : jdPin.trim();
    }

    public String getTransId() {
        return transId;
    }

    public void setTransId(String transId) {
        this.transId = transId == null ? null : transId.trim();
    }

    public String getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo == null ? null : customerNo.trim();
    }

    public Integer getBizSeparateCode() {
        return bizSeparateCode;
    }

    public void setBizSeparateCode(Integer bizSeparateCode) {
        this.bizSeparateCode = bizSeparateCode;
    }

    public String getMerchantCode() {
        return merchantCode;
    }

    public void setMerchantCode(String merchantCode) {
        this.merchantCode = merchantCode == null ? null : merchantCode.trim();
    }

    public Integer getChannel() {
        return channel;
    }

    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    public String getFundCode() {
        return fundCode;
    }

    public void setFundCode(String fundCode) {
        this.fundCode = fundCode == null ? null : fundCode.trim();
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo == null ? null : serialNo.trim();
    }

    public BigDecimal getTradeAmount() {
        return tradeAmount;
    }

    public void setTradeAmount(BigDecimal tradeAmount) {
        this.tradeAmount = tradeAmount;
    }

    public Date getBizDate() {
        return bizDate;
    }

    public void setBizDate(Date bizDate) {
        this.bizDate = bizDate;
    }

    public Integer getIsRepeat() {
        return isRepeat;
    }

    public void setIsRepeat(Integer isRepeat) {
        this.isRepeat = isRepeat;
    }

    public Integer getTradeStatus() {
        return tradeStatus;
    }

    public void setTradeStatus(Integer tradeStatus) {
        this.tradeStatus = tradeStatus;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public BigDecimal getTradePortion() {
        return tradePortion;
    }

    public void setTradePortion(BigDecimal tradePortion) {
        this.tradePortion = tradePortion;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo == null ? null : tradeNo.trim();
    }

    public Date getTradeApplyTime() {
        return tradeApplyTime;
    }

    public void setTradeApplyTime(Date tradeApplyTime) {
        this.tradeApplyTime = tradeApplyTime;
    }

    public Date getTradeConfirmTime() {
        return tradeConfirmTime;
    }

    public void setTradeConfirmTime(Date tradeConfirmTime) {
        this.tradeConfirmTime = tradeConfirmTime;
    }

    public Date getPredictConfirmTime() {
        return predictConfirmTime;
    }

    public void setPredictConfirmTime(Date predictConfirmTime) {
        this.predictConfirmTime = predictConfirmTime;
    }

    public String getPayNo() {
        return payNo;
    }

    public void setPayNo(String payNo) {
        this.payNo = payNo == null ? null : payNo.trim();
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    public Date getPayConfirmTime() {
        return payConfirmTime;
    }

    public void setPayConfirmTime(Date payConfirmTime) {
        this.payConfirmTime = payConfirmTime;
    }

    public String getPlOrderNo() {
        return plOrderNo;
    }

    public void setPlOrderNo(String plOrderNo) {
        this.plOrderNo = plOrderNo == null ? null : plOrderNo.trim();
    }

    public Integer getFrozenNeed() {
        return frozenNeed;
    }

    public void setFrozenNeed(Integer frozenNeed) {
        this.frozenNeed = frozenNeed;
    }

    public Integer getPlanType() {
        return planType;
    }

    public void setPlanType(Integer planType) {
        this.planType = planType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getYn() {
        return yn;
    }

    public void setYn(Integer yn) {
        this.yn = yn;
    }

    public Integer getTerm() {
        return term;
    }

    public void setTerm(Integer term) {
        this.term = term;
    }
}