package com.example.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author lei
 * @date 2024/3/15$
 */
@Configuration  // 配置类
@ComponentScan("com.example")
// 直接导入(推荐); 也可扫描(不推荐)
@Import(JdbcConfig.class)   // 多个数据使用数组格式
public class SpringConfig {
}
