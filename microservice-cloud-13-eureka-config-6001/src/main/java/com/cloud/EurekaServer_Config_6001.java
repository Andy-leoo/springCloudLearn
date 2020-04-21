package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <Description> <br>
 *
 * @author Andy-J<br>
 * @version 1.0<br>
 * @taskId: <br>
 * @createDate 2020/04/16 20:03 <br>
 * @      EurekaServer服务器端启动类,接受其它微服务注册进来
 * @see  <br>
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServer_Config_6001 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer_Config_6001.class, args);
    }

}
