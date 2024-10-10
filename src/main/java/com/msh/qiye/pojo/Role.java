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
@TableName("t_role")
public class Role implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "r_id", type = IdType.AUTO)
    private Integer rId;

    /**
     * 角色名
     */
    @TableField("r_name")
    private String rName;

    /**
     * 角色描述
     */
    @TableField("r_desc")
    private String rDesc;


    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName;
    }

    public String getrDesc() {
        return rDesc;
    }

    public void setrDesc(String rDesc) {
        this.rDesc = rDesc;
    }

    @Override
    public String toString() {
        return "Role{" +
        "rId=" + rId +
        ", rName=" + rName +
        ", rDesc=" + rDesc +
        "}";
    }
}
