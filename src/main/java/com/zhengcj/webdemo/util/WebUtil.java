package com.zhengcj.webdemo.util;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName WebUtil
 * @Author Administrator
 * @Describe  日志帮助类 用来获取session中的用户信息来存入数据库
 */
public class WebUtil  {
 
 
    /**
     * 从session中获取到用户对象
     * @return
     */
    public Map<String, Object> getUser(HttpServletRequest request) {
        Map<String, Object> attribute = new HashMap<>(2);
        if (request != null) {
            attribute.put("usr_name", "郑传杰");
            attribute.put("rolename", "管理员");
        }
        return attribute;
    }
}