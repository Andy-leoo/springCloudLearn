package com.cloud.learn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * <Description> <br>
 *
 * @author Andy-J<br>
 * @version 1.0<br>
 * @taskId: <br>
 * @createDate 2019/12/24 10:11 <br>
 * @ 主启动类
 * @see com.cloud.learn <br>
 */
@EnableHystrix//开启 Hystrix 熔断机制的支持
@EnableEurekaClient
@MapperScan("com.cloud.learn.mapper") //扫描所有Mapper接口
@SpringBootApplication
public class ProductProvider_8001_Hystrix {

    public static void main(String[] args) {
        SpringApplication.run(ProductProvider_8001_Hystrix.class, args);
    }
}
