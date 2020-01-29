package com.config;

import com.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public User user() {
        User user = new User();
        user.setId(1);
        user.setName("Configuration Bean");
        return user;
    }

}
