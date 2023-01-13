# msa-project
### cloud 및 kafka 등을 적용한 연습 msa 프로젝트
<br>

## [Eureka란 🌏]( https://github.com/Netflix/eureka )
### 클라우드 환경의 다수의 서비스(예: API 서버)들의 로드 밸런싱 및 장애 조치 목적을 가진 미들웨어서버이다.
### Eureka는 Netflix에서 제공한 Msa를 위한 클라우드 오픈 소스이다.
### 로드밸런스(Load Balance)에 연결 정보 등록데 대한 문제점과 에러 처리를 유연하게 처리 가능하기 위한 기술
<br>

### SpringBootApplication : 가장 기본적인 설정을 선언. 아래의 3가지 역할 수행
#### => SpringBootConfiguration :
####   스프링의 @Configuration을 대체하며 스프링 부트 전용 어노테이션
#### => ComponentScan :
#### @component 어노테이션 및 @Service, @Repository, @Controller 등의 어노테이션을 스캔하여 Bean으로 컨테이너에 등록
#### => EnableAutoConfiguration :
#### 사전에 정의한 라이브러리들을  Bean으로 등록
#### @ConditionalOnXxx… 와 같은 형태로 Condition에 적합한 경우 생성하고 생성하지 않게 설정

### @EnableEurekaServer
#### => Load Balance, Failover 등을 목적으로 Rest 기반의 서비스로 Netflix에서 유래됨
#### 부하분산을 위해 주로 사용
#### => Msa와 같은 구조안에 존재하는 서비스들의 정보를 관리하는 Server

<br>

### @EnableEurekaClient
#### => 유레카 관련만 의존해 있으며, spring-cloud-netflix에 기반을 두고 있다. 만약 msa를 Eureka 기반으로 구성한다면 EnableEurekaClient를 사용하면 되고,
#### 그 외에는 EnableDiscoveryClient를 사용하면 된다.
#### (EnableDiscoveryClient가 좀 더 많은 것들을 구현하고 있으니깐)

### @EnableDiscoveryClient
#### => 유레카 이외에 consul, zookeeper들이 구현되어있으며, spring-cloud-commons에 기반을 두고 있다.

<br>

### API Gateway Service 특징 및 기능으로는
#### - 인증 및 권한 부여
#### - 서비스 검색 통합
#### - 응답 캐싱
#### - 정책, 회로 차단기 및 Qos 다시 시도
#### - 속도 제한
#### - 부하 분산
#### - 로깅, 추적, 상관 관계
#### - 헤더, 쿼리, 문자열 및 청구 변환
#### - IP 허용 목록에 추가

<br>

#### Spring Cloud에서의 MSA 통신 방법
##### - RestTemplate
##### - WebClient
##### - Feign Client
##### 등

<br>

#### Spring Cloud에서 Gateway 설정 방법으로는
##### - [Spring Cloud Gateway](https://spring.io/projects/spring-cloud-gateway)
##### - Zuul (Spring 버전에 따라 지원여부가 다름)
##### 등 많음

