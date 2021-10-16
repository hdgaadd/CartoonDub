package com.codeman.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
@EnableWebMvc
public class SwaggerConfig extends WebMvcConfigurationSupport {
    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(getApiInfo())
                .select()
                //"com.usongon.starfire" 是扫描的包
                .apis(RequestHandlerSelectors.basePackage("com.codeman"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo getApiInfo(){
        return new ApiInfoBuilder()
                //项目标题
                .title("星火")
                //项目描述
                .description("星火项目接口文档")
                //版本
                .version("1.0.0")
                //联系方式
                .contact(new Contact("usongon", "usongon.com", "dehua@88.com"))
                .build();
    }
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //解决跨域问题
        registry.addResourceHandler("/**").addResourceLocations("/");
    }
}