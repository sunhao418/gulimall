package com.atguigu.gulimall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 1)引入依赖
     <dependency>
        <groupId>com.alibaba.cloud</groupId>
        <artifactId>spring-cloud-starter-alibaba-nacos-config</artifactId>
     </dependency>
 2）创建一个bootstrap.properties
    spring.application.name=gulimall-coupon
    spring.cloud.nacos.config.server-addr=127.0.0.1:8848
 3）需要给配置中心默认添加一个叫数据集（Data Id）gulimall-coupon.properties.默认规则：应用名.properties
 4）给 应用名.properties 添加任何配置
 5）动态获取配置  @RefreshScope 动态获取并刷新配置    @Value("${配置项的名}")  获取到配置
    优先获取配置中心配置
 */
@EnableDiscoveryClient
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class GulimallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class, args);
    }

}
