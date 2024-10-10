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
@TableName("t_sale_chance")
public class SaleChance implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "sc_id", type = IdType.AUTO)
    private Integer scId;

    /**
     * 客户名称
     */
    @TableField("sc_cusname")
    private String scCusname;

    /**
     * 机会来源（0促销、1广告、2搜索引擎、3线上咨询、4电话咨询、5邮件咨询、6客户介绍）
     */
    @TableField("sc_comming")
    private Integer scComming;

    /**
     * 联系人
     */
    @TableField("sc_name")
    private String scName;

    /**
     * 联系电话
     */
    @TableField("sc_phone")
    private String scPhone;

    /**
     * 成功几率(%)
     */
    @TableField("sc_success")
    private String scSuccess;

    /**
     * 概要
     */
    @TableField("sc_message")
    private String scMessage;

    /**
     * 机会描述
     */
    @TableField("sc_desc")
    private String scDesc;

    /**
     * 创建人
     */
    @TableField("sc_createuserid")
    private Integer scCreateuserid;

    /**
     * 创建时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @TableField("sc_createtime")
    private LocalDateTime scCreatetime;

    /**
     * 指派给谁
     */
    @TableField("sc_giveuserid")
    private Integer scGiveuserid;

    /**
     * 指派时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @TableField("sc_givetime")
    private LocalDateTime scGivetime;

    /**
     * 状态（0未分配、1已分配、2开发成功、3开发失败、4开发中）
     */
    @TableField("sc_status")
    private Integer scStatus;


    public Integer getScId() {
        return scId;
    }

    public void setScId(Integer scId) {
        this.scId = scId;
    }

    public String getScCusname() {
        return scCusname;
    }

    public void setScCusname(String scCusname) {
        this.scCusname = scCusname;
    }

    public Integer getScComming() {
        return scComming;
    }

    public void setScComming(Integer scComming) {
        this.scComming = scComming;
    }

    public String getScName() {
        return scName;
    }

    public void setScName(String scName) {
        this.scName = scName;
    }

    public String getScPhone() {
        return scPhone;
    }

    public void setScPhone(String scPhone) {
        this.scPhone = scPhone;
    }

    public String getScSuccess() {
        return scSuccess;
    }

    public void setScSuccess(String scSuccess) {
        this.scSuccess = scSuccess;
    }

    public String getScMessage() {
        return scMessage;
    }

    public void setScMessage(String scMessage) {
        this.scMessage = scMessage;
    }

    public String getScDesc() {
        return scDesc;
    }

    public void setScDesc(String scDesc) {
        this.scDesc = scDesc;
    }

    public Integer getScCreateuserid() {
        return scCreateuserid;
    }

    public void setScCreateuserid(Integer scCreateuserid) {
        this.scCreateuserid = scCreateuserid;
    }

    public LocalDateTime getScCreatetime() {
        return scCreatetime;
    }

    public void setScCreatetime(LocalDateTime scCreatetime) {
        this.scCreatetime = scCreatetime;
    }

    public Integer getScGiveuserid() {
        return scGiveuserid;
    }

    public void setScGiveuserid(Integer scGiveuserid) {
        this.scGiveuserid = scGiveuserid;
    }

    public LocalDateTime getScGivetime() {
        return scGivetime;
    }

    public void setScGivetime(LocalDateTime scGivetime) {
        this.scGivetime = scGivetime;
    }

    public Integer getScStatus() {
        return scStatus;
    }

    public void setScStatus(Integer scStatus) {
        this.scStatus = scStatus;
    }

    @Override
    public String toString() {
        return "SaleChance{" +
        "scId=" + scId +
        ", scCusname=" + scCusname +
        ", scComming=" + scComming +
        ", scName=" + scName +
        ", scPhone=" + scPhone +
        ", scSuccess=" + scSuccess +
        ", scMessage=" + scMessage +
        ", scDesc=" + scDesc +
        ", scCreateuserid=" + scCreateuserid +
        ", scCreatetime=" + scCreatetime +
        ", scGiveuserid=" + scGiveuserid +
        ", scGivetime=" + scGivetime +
        ", scStatus=" + scStatus +
        "}";
    }
}
