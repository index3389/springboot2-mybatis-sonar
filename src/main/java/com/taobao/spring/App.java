package com.taobao.spring;

import com.taobao.spring.mapper.UserMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@MapperScan(value = "com.taobao.spring.mapper")
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
        UserMapper userMapper = context.getBean(UserMapper.class);
        System.out.println(userMapper);
        System.out.println(userMapper.queryUserById(1L));
        context.close();
    }
}
