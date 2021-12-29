package com.zhengcj.webdemo.entity.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName CrmLogMessage
 * @Author Administrator
 * @Describe 数据库日志类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CrmLogMessage {
    private Integer logid;//日志id
    private String UserName;//管理员姓名
    private String UserRole;//管理员角色
    private String Content;//日志描述
    private String Remarks;//参数集合
    private String TableName;//表格名称
    private String DateTime;//操作时间
    private String resultValue;//返回值
    private String ip;//ip地址
    private String requestUrl;//请求地址
    private String result;//操作结果
    private String ExString;//错误信息

}
 