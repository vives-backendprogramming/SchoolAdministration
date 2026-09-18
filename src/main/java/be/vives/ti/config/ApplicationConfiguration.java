package be.vives.ti.config;

import be.vives.ti.model.MailTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan("be.vives.ti")
@PropertySource("classpath:/application.properties")
public class ApplicationConfiguration {

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public MailTemplate vivesMailTemplate() {
        return new MailTemplate("VIVES - Design your future",
                "VIVES - all rights reserved",
                "vives.jpg");
    }
}
