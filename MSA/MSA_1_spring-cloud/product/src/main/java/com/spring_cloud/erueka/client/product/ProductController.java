package com.spring_cloud.erueka.client.product;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Value("${server.port}") // 애플리케이션이 실행 중인 포트를 주입받습니다.
    private String serverPort;

    @GetMapping("/product/{id}")
    public String getProduct(@PathVariable String id) {
        //전달받은 아이디 반환
        return "Product " + id + " info!!!!! From port : " + serverPort ;
    }


}


