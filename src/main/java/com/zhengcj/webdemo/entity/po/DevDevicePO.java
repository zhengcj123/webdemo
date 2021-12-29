package com.zhengcj.webdemo.entity.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * <p>
 * 设备表
 * </p>
 *
 * @author zhengcj
 * @since 2021-09-08
 */
@Data
@TableName("dev_device")
public class DevDevicePO implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("dev_code")
    private String devCode;

    @TableField("dev_name")
    private String devName;

    @TableField("factory_id")
    private String factoryId;

    @TableField("abbreviation")
    private String abbreviation;

    @TableField("category_id")
    private String categoryId;

    @TableField("factory_section_id")
    private String factorySectionId;

    @TableField("craft")
    private String craft;

    @TableField("equipment_level")
    private String equipmentLevel;

    @TableField("setup_date")
    private Date setupDate;

    @TableField("manufacture")
    private String manufacture;

    @TableField("supplyer")
    private String supplyer;

    @TableField("production_date")
    private Date productionDate;

    @TableField("enable")
    private Boolean enable;

    @TableField("use_status")
    private Integer useStatus;

    @TableField("curingd")
    private Boolean curingd;

    @TableField("dev_brand")
    private String devBrand;

    @TableField("dev_model")
    private String devModel;

    @TableField("unit")
    private String unit;

    @TableField("maintain_month")
    private Integer maintainMonth;

    @TableField("production_code")
    private String productionCode;

    @TableField("extended_field")
    private String extendedField;

    @TableField("tag_card")
    private String tagCard;

    @TableField("deleted")
    @TableLogic
    private Boolean deleted;

    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private Date createTime;

    @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    @Override
    public String toString() {
        return "DevDevicePO{" +
                "id=" + id +
                ", devCode='" + devCode + '\'' +
                ", devName='" + devName + '\'' +
                ", factoryId='" + factoryId + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", categoryId='" + categoryId + '\'' +
                ", factorySectionId='" + factorySectionId + '\'' +
                ", craft='" + craft + '\'' +
                ", equipmentLevel='" + equipmentLevel + '\'' +
                ", setupDate=" + setupDate +
                ", manufacture='" + manufacture + '\'' +
                ", supplyer='" + supplyer + '\'' +
                ", productionDate=" + productionDate +
                ", enable=" + enable +
                ", useStatus=" + useStatus +
                ", curingd=" + curingd +
                ", devBrand='" + devBrand + '\'' +
                ", devModel='" + devModel + '\'' +
                ", unit='" + unit + '\'' +
                ", maintainMonth=" + maintainMonth +
                ", productionCode='" + productionCode + '\'' +
                ", extendedField='" + extendedField + '\'' +
                ", tagCard='" + tagCard + '\'' +
                ", deleted=" + deleted +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
