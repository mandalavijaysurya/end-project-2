package org.project2.userservice.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmailServiceAdminConfiguration {

    @Bean("email-service-topic")
    public NewTopic getNewTopic(){
        return new NewTopic
    }
}
