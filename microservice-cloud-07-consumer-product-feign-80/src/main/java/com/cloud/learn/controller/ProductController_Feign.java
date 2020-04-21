package com.cloud.learn.controller;

import com.cloud.learn.bean.Product;
import com.cloud.learn.service.ProductClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * <Description> <br>
 *
 * @author Andy-J<br>
 * @version 1.0<br>
 * @taskId: <br>
 * @createDate 2019/12/24 14:32 <br>
 * @ 消费者   控制层
 * @see com.cloud.learn.controller <br>
 */
@RestController
@RequestMapping("/consumer")
public class ProductController_Feign {

    @Autowired
    private ProductClientService service;

//    private static final String REST_URL_PREFIX = "http://localhost:8001";
    //修改为Eureka注册中心的地址
    private static final String REST_URL_PREFIX = "http://microservice-product";

    @RequestMapping(value = "/product/add")
    public boolean add(Product product){
        return service.add(product);
    }

    @RequestMapping(value = "/product/get/{id}")
    public Product get(@PathVariable("id") Long id) {
        return service.get(id);
    }

    @RequestMapping(value = "/product/list")
    public List<Product> list() {
        return service.list();
    }


}
