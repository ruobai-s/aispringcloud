###Ribbon负载均衡
* 什么是Ribbon？
```
SpringCloud Ribbon是一个负载均衡解决方案，Ribbon是Netflix发布的负载均衡器，SpringCloud Ribbon是基于Netflix Ribbon实现的,是一个用于对HTTP请求进行控制的负载均衡客户端.
在注册中心对Ribbon进行注册之后，Ribbon就可以基于某种负载均衡算法，如轮询、随机、加权轮询、加权随机等自动帮助服务消费者调用接口，开发者可以根据具体需求自定义Ribbon负载均衡算法，实际开发中，
SpringCloud Ribbon需要结合SpringCloud Eureka来使用，Eurka Server提供所有可以调用的服务提供者列表，Ribbon基于特定的负载均衡算法从这些服务提供者中选择要调用的具体实例
```
* pom依赖
```xml
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
    <version>2.0.2.RELEASE</version>
</dependency>
```
* 创建启动类
* 注解解释
``@LoadBalanced``：声明一个基于Ribbon的负载均衡服务