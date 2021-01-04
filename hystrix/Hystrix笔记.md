###Hystrix容错机制
* 在不改变各个微服务调用关系的前提下，针对错误情况进行预先处理。
* 设计原则:
```
1、服务隔离机制:
2、服务降级机制:
3、熔断机制:
4、提供实时的监控和报警功能:
5、提供实时的配置修改功能:
```
* Hystrix数据监控需要结合SpringCloud Actuator来使用,Actuator提供了对服务的健康监控、数据统计,可以通过hystrix-stream节点获取监控的请求数据,提供了可视化的监控界面
* 注解解释:
`@EnableCircuitBreaker`: 声明启用数据监控
`@EnableHystrixDashboard`: 声明启用可视化的数据监控