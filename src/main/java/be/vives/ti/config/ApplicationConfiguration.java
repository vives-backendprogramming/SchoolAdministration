package be.vives.ti.config;

import be.vives.ti.model.MailTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("be.vives.ti")
public class ApplicationConfiguration {

    @Bean
    public MailTemplate vivesMailTemplate() {
        return new MailTemplate("VIVES - Design your future",
                "VIVES - all rights reserved",
                "vives.jpg");
    }
}
