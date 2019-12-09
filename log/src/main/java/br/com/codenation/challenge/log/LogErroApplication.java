package br.com.codenation.challenge.log;

import br.com.codenation.challenge.core.property.JwtConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan({"br.com.codenation.challenge.core.model"})
@EnableJpaRepositories({"br.com.codenation.challenge.core.repository"})
@EnableConfigurationProperties(value = JwtConfiguration.class)
@ComponentScan("br.com.codenation.challenge")
public class LogErroApplication {

    public static void main(String[] args) {
        SpringApplication.run(LogErroApplication.class, args);
    }

}
