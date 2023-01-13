package com.yrkim.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/*
* SpringBootApplication : 가장 기본적인 설정을 선언. 아래의 3가지 역할 수행
* => SpringBootConfiguration :
*   스프링의 @Configuration을 대체하며 스프링 부트 전용 어노테이션
* => ComponentScan :
*   @component 어노테이션 및 @Service, @Repository, @Controller 등의 어노테이션을 스캔하여 Bean으로 컨테이너에 등록
* => EnableAutoConfiguration :
*   사전에 정의한 라이브러리들을  Bean으로 등록
*   @ConditionalOnXxx… 와 같은 형태로 Condition에 적합한 경우 생성하고 생성하지 않게 설정
*
* @EnableEurekaServer
* => Load Balance, Failover 등을 목적으로 Rest 기반의 서비스로 Netflix에서 유래됨
*   부하분산을 위해 주로 사용
* => Msa와 같은 구조안에 존재하는 서비스들의 정보를 관리하는 Server
* */

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiscoveryApplication.class, args);
    }

}
