package org.example.CreatBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {


    @Bean
    Parrot parrot(){
        Parrot p = new Parrot();
        return p;
    }
}
