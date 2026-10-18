package org.example;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// scan all the class that there in the projects
@ComponentScan
public class AppConfig {

    @Bean
    public UserService userService() {
        return new UserService();
    }
}
