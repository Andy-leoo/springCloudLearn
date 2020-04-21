package com.cloud.learn.service;

import com.cloud.learn.bean.Product;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <Description> <br>
 *
 * @author Andy-J<br>
 * @version 1.0<br>
 * @taskId: <br>
 * @createDate 2020/01/10 17:09 <br>
 *
 * @  熔断  报错返回类
 * @see com.cloud.learn.service <br>
 */
@Component //注入到容器中去
public class ProductClientServiceFallBack implements ProductClientService {
    @Override
    public boolean add(Product product) {
        return false;
    }

    @Override
    public Product get(Long id) {
        return new Product(id , "id= "+id+"无数据","无有效数据库");
    }

    @Override
    public List<Product> list() {
        return null;
    }
}
