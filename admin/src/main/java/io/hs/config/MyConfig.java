package io.hs.config;

import io.hs.surpport.CommonFileNameFactory;
import io.hs.surpport.FilePathConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

/**
 * @author clm
 * @Date 2021/8/30 10:48
 */
@Configuration
public class MyConfig {

    @Bean("multipartResolver")
    public CommonsMultipartResolver multipartResolver(){
        return new CommonsMultipartResolver();
    }

    @Bean
    public CommonFileNameFactory commonFileNameFactory(){
        return new CommonFileNameFactory();
    }

    @Bean
    public FilePathConfig filePathConfig(){
        return new FilePathConfig();
    }

    @Bean
    public CharacterEncodingFilter characterEncodingFilter() {
        return new CharacterEncodingFilter("UTF-8",true);
    }
}