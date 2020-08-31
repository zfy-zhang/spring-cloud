package com.pat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
// 多个 Ribbon 定义
//@RibbonClients({
//        @RibbonClient(name = "spring-cloud-service-provider")
//})
public class SpringCloudEurekaServerRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaServerRibbonApplication.class, args);
    }

    //声明 RestTemplate
//    @LoadBalanced // RestTemplate 的行为变化
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
