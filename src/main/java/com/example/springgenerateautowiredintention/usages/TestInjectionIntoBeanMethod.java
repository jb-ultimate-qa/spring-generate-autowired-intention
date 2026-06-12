package com.example.springgenerateautowiredintention.usages;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class TestInjectionIntoBeanMethod {

    @Bean
    public LocalBean localBean() {
        // test Generate / AutowireBean... here
        // test injection by completion:
        // bean
        return new LocalBean();
    }
}
class LocalBean {

}