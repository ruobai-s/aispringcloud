###Spring cloud zipkin
* Zipkin是一个可以采集并跟踪分布式系统中请求数据的组件，让开发者可以更加直观的监控到请求在各个微服务所耗费的时间。
ZipKin：ZipKin server、ZipKin Client
* 注解说明
`@EnableZipkinServer`: 声明启动ZipKin Server
* 属性说名
`spring.sleuth.web.client.enabled`：设置开启请求跟踪
`spring.sleuth.sampler.probabilty`: 设置采样比例，默认是1.0
`spring.zipkin.base-url`: ZipKinServer地址
