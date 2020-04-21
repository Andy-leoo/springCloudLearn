package com.cloud.learn.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <Description> <br>
 *
 * @author Andy-J<br>
 * @version 1.0<br>
 * @taskId: <br>
 * @createDate 2020/01/16 17:29 <br>
 * @ 通过Rest方式验证是否能够读取到 GitHub 上的配置信息
 * @see com.cloud.learn <br>
 */
@RestController
public class ConfigClient {

    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${server.port}")
    private String port;

    @RequestMapping("/config")
    public String getConfig(){
        String config = "applicationName : " + applicationName + "; port : "+ port;
        System.out.println(config);
        return config;
    }
}
