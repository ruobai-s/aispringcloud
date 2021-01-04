###Feign
* 什么是Feign?
```
与Ribbon一样，Feign也是由Netflix提供的，Feign是一个声明式、模板化的WebService客户端，它简化了开发者编写Web服务客户端的操作，
开发者可以通过简单的接口和注解来调用HTTP API，SpringCloud Feign，
它整合了Ribbon和Hystrix，
具有可插拔、基于注解、负载均衡、服务熔断等一系列的便捷功能
相比较于Ribbon+RestTemplage的方式，Feign大大简化了代码的开发，Feign支持多种注解，包括Feign注解、JAX-RS注解、SpringMVC注解等等,
SpringCloud 对Feign进行了优化，整合了Ribbon和Eureka，从而让Feign的使用更加方便
```
* Ribbon和Feign的区别
Ribbon 是一个通用的HTTP客户端工具，Feign是基于Ribbon实现的.
* Feign的特点
  * 1.Feign是一个声明式的WebService客户端
  * 2.支持Feign注解、SpringMVC注解、JAX-RS注解
  * 3.Feign基于Ribbon实现，使用起来更加简单
  * 4.Feign集成了Hystrix，具备服务熔断的功能
* pom依赖：
```
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
    <version>2.0.2.RELEASE</version>
</dependency>
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-openfeign</artifactId>
    <version>2.0.2.RELEASE</version>
</dependency>
```
* 创建配置文件：
* Feign服务熔断：
``feign.hystrix.enabled``:是否开启熔断器
