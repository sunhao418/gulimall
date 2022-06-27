package com.atguigu.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.ControllerAdvice;

/*
    1.整合mybatis plus
       1）导入依赖 <dependency>
                     <groupId>com.baomidou</groupId>
                     <artifactId>mybatis-plus-boot-starter</artifactId>
                     <version>3.3.1</version>
                 </dependency>
       2）配置：1.配置数据源
                  1）导入数据库的驱动
                  2）在application.yml配置数据源相关信息
              2.配置mybatis-plus
                  1）使用@MapperScan
                  2）告诉mybatis-plus，sql映射文件位置

    2.逻辑删除
       1）配置全局的逻辑删除规则（可省略）
               mybatis-plus:
                    global-config:
                         db-config:
                             logic-delete-field: flag  # 全局逻辑删除的实体字段名(since 3.3.0,配置后可以忽略不配置步骤2)
                             logic-delete-value: 1 # 逻辑已删除值(默认为 1)
                             logic-not-delete-value: 0 # 逻辑未删除值(默认为 0)
      2）配置逻辑删除组件Bean（高版本可省略）
      3）给Bean实体类字段上加上@TableLogic注解
      4)分组校验（多场景的复杂校验）
          1)给校验注解标注什么情况需要进行校验 @NotBlank(message = "品牌名必须提交",groups = {UpdateGroup.class,AddGroup.class})
          2） @Validated(AddGroup.class)
          3)默认没有指定分组的校验注解@NotBlank，在分组校验情况@Validated(AddGroup.class)下不生效，只会在@Validated生效
      5）自定义校验
          1）编写一个自定义的校验注解
          2）编写一个自定义的校验注器  ConstraintValidator
          3)关联自定义的校验器和自定义的检验注解
                @Documented
                @Constraint(validatedBy = {ListValueConstraintValidator.class【可以指定多个不同的校验器，适配不同类型的校验】})
                @Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
                @Retention(RetentionPolicy.RUNTIME)
   3.JSR303
      1)给Bean添加校验注解:   javax.validation.constraints，并定义自己的message提示
      2)开启校验功能@Valid
            效果：校验错误会有默认的响应
      3）给校验的bean后紧跟一个BindingResult，就可以获取到校验的结果

   4.统一的异常处理   @ControllerAdvice
      1)
 */
@EnableDiscoveryClient
@MapperScan("com.atguigu.gulimall.product.dao")
@SpringBootApplication
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
