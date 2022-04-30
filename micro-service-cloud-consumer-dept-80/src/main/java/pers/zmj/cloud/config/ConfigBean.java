package pers.zmj.cloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {

    @Bean //将RestTemplate 注入容器
    @LoadBalanced // 在客户端使用 RestTemplate 请求服务端时，开启负载均衡（Ribbon）
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
