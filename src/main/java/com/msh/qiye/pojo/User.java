package com.msh.qiye.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author msh
 * @since 2024-09-19
 */
@TableName("t_user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "u_id", type = IdType.AUTO)
    private Integer uId;

    @TableField("u_name")
    private String uName;

    @TableField("u_password")
    private String uPassword;

    @TableField("r_id")
    private Integer rId;


    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    @Override
    public String toString() {
        return "User{" +
        "uId=" + uId +
        ", uName=" + uName +
        ", uPassword=" + uPassword +
        ", rId=" + rId +
        "}";
    }
}
