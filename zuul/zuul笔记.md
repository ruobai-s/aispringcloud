###ZUUL（服务网关):
*Zuul的概念：
```
Zuul是Netflix提供的一个开源的API网关服务器,是客户端和网站后端所有请求的中间层，对外开放一个API,
将所有请求导入统一的入口，屏蔽了服务端的具体实现路基，Zuul可以实现反向代理功能，在网关内部实现动态路由、身份认证、IP过滤、数据监控等
```
*pom依赖
```xml
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
    <version>2.0.2.RELEASE</version>
</dependency>
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-netflix-zuul</artifactId>
    <version>2.0.2.RELEASE</version>
</dependency>
```
* yml属性解释:
``
zuul.routes.provider:给服务提供者porvider设置映射
``
* 注解说明:
``@EnableZuulProxy:``包含了``@EnableZuulServer``设置该类是网关的启动类
``@EnableAutoConfiguration:``可以帮助SpringBoot应用将所有符合条件的``@Configuration``配置加载到当前SpringBoot创建并使用的IOC容器中
* Zuul自带了负载均衡功能，修改provider的代码