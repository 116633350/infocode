package com.info.cop.datasource;

import com.alibaba.druid.filter.config.ConfigTools;
import com.alibaba.druid.util.DruidPasswordCallback;

import java.util.Properties;

/**
 * @author huhaizhou
 * @version V1.0
 * @description:密码回调类
 * @date 2020/11/20
 */

public class DbPasswordCallback extends DruidPasswordCallback {
    /**
     * @param properties 属性值列表
     * @description:处理解密
     */
    @Override
    public void setProperties(Properties properties) {
        super.setProperties(properties);
        String password = (String) properties.get("password");
        String publickey = (String) properties.get("publicKey");
        try {
            String dbpassword = ConfigTools.decrypt(publickey, password);
            setPassword(dbpassword.toCharArray());
        } catch (Exception e) {
            //log.error("获取数据库密码解密异常",e.getMessage());
        }
    }

}
