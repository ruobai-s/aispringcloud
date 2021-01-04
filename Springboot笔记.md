###SpringCloud：
* 服务治理：Eureka
* 服务通信：Ribbon、Feign
* 服务网关：Zuul
* 服务容错：Hystrix
* 服务配置：Config
* 服务监控：Actuator
* 服务跟踪：Zipkin
###SpringCloud组成：
* 服务提供者、服务消费者、注册中心
###SpringCloud依赖：
* parent:
```xml
<parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>2.0.7.RELEASE</version>
</parent>
<!--springboot相关依赖-->
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <version>1.18.12</version>
        <scope>provided</scope>
    </dependency>
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <scope>test</scope>
    </dependency>
<!--        解决JDK9以上没有JAXB API的问题-->
<!--        <dependency>-->
<!--            <groupId>javax.xml.bind</groupId>-->
<!--            <artifactId>jaxb-api</artifactId>-->
<!--            <version>2.3.0</version>-->
<!--        </dependency>-->

<!--        <dependency>-->
<!--            <groupId>com.sun.xml.bind</groupId>-->
<!--            <artifactId>jaxb-impl</artifactId>-->
<!--            <version>2.3.0</version>-->
<!--        </dependency>-->

<!--        <dependency>-->
<!--            <groupId>com.sun.xml.bind</groupId>-->
<!--            <artifactId>jaxb-core</artifactId>-->
<!--            <version>2.3.0</version>-->
<!--        </dependency>-->

<!--        <dependency>-->
<!--            <groupId>javax.activation</groupId>-->
<!--            <artifactId>activation</artifactId>-->
<!--            <version>1.1.1</version>-->
<!--        </dependency>-->
</dependencies>
<!--SpringCloud相关依赖-->
<dependencyManagement>
    <dependencies>
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-dependencies</artifactId>
            <version>Finchley.SR2</version>
            <!--依赖引入方式-->
            <type>pom</type>
            <scope>import</scope>
        </dependency>
    </dependencies>
</dependencyManagement>