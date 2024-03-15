package com.example.service;

import com.mchange.v2.c3p0.DriverManagerDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**
 * @author lei
 * @date 2024/3/15$
 */
@Configuration
@PropertySource("classpath:jdbc.properties")    // 加载 properties 文件: 仅支持单一文件配置，多文件采用数组格式，不允许使用通配符
public class JdbcConfig {
    @Bean
    public DataSource getDataSource(){
        return new DriverManagerDataSource();
    }
}
