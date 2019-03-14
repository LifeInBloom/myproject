package cn.zhao.spring.myproject.regcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class RegcenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegcenterApplication.class, args);
    }

}
