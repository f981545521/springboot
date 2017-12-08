## 配置mybatis自动注入Mapper

### 配置数据源(application.properties)
```
spring.datasource.url=jdbc:mysql://localhost:3306/iblog?characterEncoding=UTF-8
spring.datasource.username=root
spring.datasource.password=yxserver
spring.datasource.driver-class-name=com.mysql.jdbc.Driver
```


### 第①种方式
 1. 在Mapper接口上增加`@Mapper`注解
 2. 修改application.properties
    ```
    #MyBatis整合SpringBoot
    #[可选]mybatis.type-aliases-package=cn.acyou.pojo
    mybatis.config-location=classPath:conf/mybatis-config.xml
    #[可选]mybatis.mapper-locations=classpath:mapper/*.xml
    ```
> 说明：
> - `@Mapper`注解相当于接口扫描
> - 在`mybatis-config`文件中配置`mapper.xml`扫描后不能再使用`mybatis.mapper-locations`重复定义（会报错）


### 第②种方式
 1. 通过配置类`MyBatisConfigurer.java`
 2. 详情请查询本类[MyBatisConfigurer](https://github.com/f981545521/springboot/blob/master/src/main/java/cn/acyou/conf/MyBatisConfigurer.java)







