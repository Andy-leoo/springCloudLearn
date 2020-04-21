package com.cloud.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <Description> <br>
 *
 * @author Andy-J<br>
 * @version 1.0<br>
 * @taskId: <br>
 * @createDate 2019/12/27 17:02 <br>
 * @ 集群 第二台 eureka 服务器
 * @see com.cloud.learn <br>
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServer_6002 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer_6002.class,args);
    }
}
