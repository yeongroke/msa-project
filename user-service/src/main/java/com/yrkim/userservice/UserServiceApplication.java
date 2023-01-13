package com.yrkim.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/*
* @EnableEurekaClient
* => 유레카 관련만 의존해 있으며, spring-cloud-netflix에 기반을 두고 있다. 만약 msa를 Eureka 기반으로 구성한다면 EnableEurekaClient를 사용하면 되고,
* 그 외에는 EnableDiscoveryClient를 사용하면 된다.
* (EnableDiscoveryClient가 좀 더 많은 것들을 구현하고 있으니깐)
*
* @EnableDiscoveryClient
* => 유레카 이외에 consul, zookeeper들이 구현되어있으며, spring-cloud-commons에 기반을 두고 있다.
* */

@SpringBootApplication
@EnableDiscoveryClient
public class UserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }

}
