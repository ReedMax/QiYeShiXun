package com.msh.qiye.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author msh
 * @since 2024-09-19
 */
@TableName("t_customer")
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 客户编号
     */
    @TableId(value = "cus_id", type = IdType.AUTO)
    private Integer cusId;

    /**
     * 客户名称
     */
    @TableField("cus_name")
    private String cusName;

    /**
     * 客户地区。1-东北，2-华北，3-西北，4-西南，5-华南，6-华中，7-华东
     */
    @TableField("cus_region")
    private Integer cusRegion;

    /**
     * 客户行业. 1-金融，2-房地产，3-商业服务，4-运输物流，	   5-生产，6-政府，7-文化传媒，8-其它
     */
    @TableField("cus_industry")
    private Integer cusIndustry;

    /**
     * 客户等级. A-重点客户；B-普通客户；C-非优先客户
     */
    @TableField("cus_level")
    private String cusLevel;

    /**
     * 客户满意度. 1-一级，2-二级，3-三级，4-四级，5-五级
     */
    @TableField("cus_satisfy")
    private Integer cusSatisfy;

    /**
     * 客户信用度. 1-一级，2-二级，3-三级，4-四级，5-五级
     */
    @TableField("cus_credit")
    private Integer cusCredit;

    /**
     * 客户地址
     */
    @TableField("cus_addr")
    private String cusAddr;

    /**
     * 客户邮编
     */
    @TableField("cus_zipcode")
    private Integer cusZipcode;

    /**
     * 客户电话
     */
    @TableField("cus_phone")
    private String cusPhone;

    /**
     * 客户传真
     */
    @TableField("cus_fax")
    private String cusFax;

    /**
     * 客户网址
     */
    @TableField("cus_url")
    private String cusUrl;

    /**
     * 客户经理id
     */
    @TableField("user_id")
    private Integer userId;

    /**
     * 客户状态.1-正常，0-流失
     */
    @TableField("cus_status")
    private Integer cusStatus;

    /**
     * 创建时间，默认当前时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @TableField("cus_createtime")
    private LocalDateTime cusCreatetime;


    public Integer getCusId() {
        return cusId;
    }

    public void setCusId(Integer cusId) {
        this.cusId = cusId;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public Integer getCusRegion() {
        return cusRegion;
    }

    public void setCusRegion(Integer cusRegion) {
        this.cusRegion = cusRegion;
    }

    public Integer getCusIndustry() {
        return cusIndustry;
    }

    public void setCusIndustry(Integer cusIndustry) {
        this.cusIndustry = cusIndustry;
    }

    public String getCusLevel() {
        return cusLevel;
    }

    public void setCusLevel(String cusLevel) {
        this.cusLevel = cusLevel;
    }

    public Integer getCusSatisfy() {
        return cusSatisfy;
    }

    public void setCusSatisfy(Integer cusSatisfy) {
        this.cusSatisfy = cusSatisfy;
    }

    public Integer getCusCredit() {
        return cusCredit;
    }

    public void setCusCredit(Integer cusCredit) {
        this.cusCredit = cusCredit;
    }

    public String getCusAddr() {
        return cusAddr;
    }

    public void setCusAddr(String cusAddr) {
        this.cusAddr = cusAddr;
    }

    public Integer getCusZipcode() {
        return cusZipcode;
    }

    public void setCusZipcode(Integer cusZipcode) {
        this.cusZipcode = cusZipcode;
    }

    public String getCusPhone() {
        return cusPhone;
    }

    public void setCusPhone(String cusPhone) {
        this.cusPhone = cusPhone;
    }

    public String getCusFax() {
        return cusFax;
    }

    public void setCusFax(String cusFax) {
        this.cusFax = cusFax;
    }

    public String getCusUrl() {
        return cusUrl;
    }

    public void setCusUrl(String cusUrl) {
        this.cusUrl = cusUrl;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCusStatus() {
        return cusStatus;
    }

    public void setCusStatus(Integer cusStatus) {
        this.cusStatus = cusStatus;
    }

    public LocalDateTime getCusCreatetime() {
        return cusCreatetime;
    }

    public void setCusCreatetime(LocalDateTime cusCreatetime) {
        this.cusCreatetime = cusCreatetime;
    }

    @Override
    public String toString() {
        return "Customer{" +
        "cusId=" + cusId +
        ", cusName=" + cusName +
        ", cusRegion=" + cusRegion +
        ", cusIndustry=" + cusIndustry +
        ", cusLevel=" + cusLevel +
        ", cusSatisfy=" + cusSatisfy +
        ", cusCredit=" + cusCredit +
        ", cusAddr=" + cusAddr +
        ", cusZipcode=" + cusZipcode +
        ", cusPhone=" + cusPhone +
        ", cusFax=" + cusFax +
        ", cusUrl=" + cusUrl +
        ", userId=" + userId +
        ", cusStatus=" + cusStatus +
        ", cusCreatetime=" + cusCreatetime +
        "}";
    }
}
