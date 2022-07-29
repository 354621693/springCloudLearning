package com.leemanshow.manshowshop.order.entity;

import java.util.Date;

public class OrderInfo {
    private Integer id;

    private Integer status;

    private Integer userId;

    private Byte isdel;

    private Integer payType;

    private String zfbPayId;

    private String wxPayId;

    private Date createTime;

    private Date updateTime;

    private Integer orderPrice;

    private Integer deliveryMode;

    private Integer discountsMode;

    private Integer discountsAmount;

    private Integer actualPayment;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Byte getIsdel() {
        return isdel;
    }

    public void setIsdel(Byte isdel) {
        this.isdel = isdel;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public String getZfbPayId() {
        return zfbPayId;
    }

    public void setZfbPayId(String zfbPayId) {
        this.zfbPayId = zfbPayId == null ? null : zfbPayId.trim();
    }

    public String getWxPayId() {
        return wxPayId;
    }

    public void setWxPayId(String wxPayId) {
        this.wxPayId = wxPayId == null ? null : wxPayId.trim();
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

    public Integer getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Integer orderPrice) {
        this.orderPrice = orderPrice;
    }

    public Integer getDeliveryMode() {
        return deliveryMode;
    }

    public void setDeliveryMode(Integer deliveryMode) {
        this.deliveryMode = deliveryMode;
    }

    public Integer getDiscountsMode() {
        return discountsMode;
    }

    public void setDiscountsMode(Integer discountsMode) {
        this.discountsMode = discountsMode;
    }

    public Integer getDiscountsAmount() {
        return discountsAmount;
    }

    public void setDiscountsAmount(Integer discountsAmount) {
        this.discountsAmount = discountsAmount;
    }

    public Integer getActualPayment() {
        return actualPayment;
    }

    public void setActualPayment(Integer actualPayment) {
        this.actualPayment = actualPayment;
    }
}