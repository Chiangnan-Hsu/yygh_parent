package com.atguigu.yygh.hosp.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author chiang_hsu
 * @create 2023-06-06-16:14
 * @describe
 */
@Configuration
@MapperScan("com.atguigu.yygh.hosp.mapper")
public class HospConfig {
}
