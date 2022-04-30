package pers.zmj.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class ConsumerDeptHystrixDashboard9002Application {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerDeptHystrixDashboard9002Application.class, args);
    }
}
