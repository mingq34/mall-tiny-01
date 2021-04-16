package com.macro.mall.tiny.malltiny01.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther Tyler Yao
 * @Desc 注释
 * @Date 2021-04-16 10:53
 */
@Configuration
@MapperScan("com.macro.mall.tiny.malltiny01.mbg.mapper")
public class MyBatisConfig {
}
