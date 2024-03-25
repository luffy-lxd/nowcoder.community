package com.nowcoder.community.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;

/**
 * @author luffy
 * @version 1.0
 */
@Configuration//表示是配置类 不是普通类
public class AlphaConfig {
    @Bean
    //该方法返回的对象将被装配到容器中，bean的名字simpleDateFormat
    public SimpleDateFormat simpleDateFormat(){
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }
}
