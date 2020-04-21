package com.cloud.learn.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * <Description> <br>
 *
 * @author Andy-J<br>
 * @version 1.0<br>
 * @taskId: <br>
 * @createDate 2019/12/24 14:28 <br>
 * @ 向容器中注入 RestTemplate 组件, 提供了多种简单便捷的访问 Restful 服务的方法，是Spring提供的用于访
 *      问Rest服务的客户端模板工具集。
 * @see com.cloud.learn.config <br>
 */
@Configuration
public class ConfigBean {

     ///@LoadBalanced表示这个RestTemplate开启负载均衡，在调用服务提供者的接口时，
     //可使用 服务名称 替代真实IP地址。服务名称 就是服务提供者在application.yml中
     //配置的spring.application.name属性的值
    //向容器中添加 RestTemplate 组件,直接通过此组件可调用 REST 接口
    @LoadBalanced
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
