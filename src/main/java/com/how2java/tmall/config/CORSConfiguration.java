package com.how2java.tmall.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @Autour:ycw
 * @Date；2019/11/27 15:47
 * @Version 1.0
 */
@Configuration
public class CORSConfiguration extends WebMvcConfigurerAdapter {
@Override
    public void addCorsMappings(CorsRegistry registry){
    //允许所有请求都跨域
    registry.addMapping("/**")
            .allowedMethods("*")
            .allowedOrigins("*")
            .allowedHeaders("*");
}
}
