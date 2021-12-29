package com.zhengcj.webdemo.entity.po;


import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
* desc: 组织机构表(树状的组织:集团-分区-工厂)
*
* @author zhengcj
* date: 2021-11-29 13:23:27
*/
@Data
@Accessors(chain = true)
@TableName("fty_factory")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FactoryPO implements Serializable{

    /**
    * 主键ID
    */
    @TableId(type = IdType.ASSIGN_ID, value = "id")
    private String id;
    /**
    * 工厂名称
    */
    @TableField("factory_name")
    private String factoryName;
    /**
    * 编码
    */
    @TableField("factory_code")
    private String factoryCode;
    /**
    * 电话
    */
    @TableField("telephone")
    private String telephone;
    /**
    * 省
    */
    @TableField("province")
    private String province;
    /**
    * 市
    */
    @TableField("city")
    private String city;
    /**
    * 区
    */
    @TableField("area")
    private String area;
    /**
    * 状态
    */
    @TableField("factory_status")
    private Boolean factoryStatus;
    /**
    * 工厂地址
    */
    @TableField("factory_address")
    private String factoryAddress;
    /**
    * 工厂坐标
    */
    @TableField("factory_coordinate")
    private String factoryCoordinate;
    /**
    * 排序
    */
    @TableField("sort")
    private Integer sort;
    /**
    * 组织类型ID：1集团  2：分区 3 ：工厂  4：部门
    */
    @TableField("organization_type")
    private String organizationType;
    /**
    * 行业类型：1集团 2:污水厂
    */
    @TableField("industry_type")
    private String industryType;
    /**
    * 设计规模
    */
    @TableField("design_pattern")
    private String designPattern;
    /**
    * 处理工艺
    */
    @TableField("treatment_process")
    private String treatmentProcess;
    /**
    * 排放标准
    */
    @TableField("emission_standard")
    private String emissionStandard;
    /**
    * 联系人
    */
    @TableField("contacts")
    private String contacts;
    /**
    * 联系电话
    */
    @TableField("contacts_number")
    private String contactsNumber;
    /**
    * 地址
    */
    @TableField("address")
    private String address;
    /**
    * PID
    */
    @TableField("pid")
    private String pid;
    /**
    * mongodb数据库集合名称，每个工厂一个集合
    */
    @TableField("database_name")
    private String databaseName;
    /**
    * 是否显示
    */
    @TableField("displayd")
    private Boolean displayd;
    /**
    * 是否删除
    */
    @TableLogic
    @TableField("deleted")
    private Boolean deleted;
    /**
    * 描述
    */
    @TableField("description")
    private String description;
    /**
    * 创建时间
    */
    @TableField("create_time")
    private Date createTime;
    /**
    * 修改时间
    */
    @TableField("update_time")
    private Date updateTime;

}