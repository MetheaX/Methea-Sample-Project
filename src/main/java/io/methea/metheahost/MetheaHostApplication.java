package io.methea.metheahost;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"io.methea"})
@EnableJpaRepositories(basePackages = {"io.methea"})
@EntityScan(basePackages = {"io.methea"})
@ComponentScan(basePackages = {"io.methea"})
public class MetheaHostApplication {
    public static void main(String[] args) {
        SpringApplication.run(MetheaHostApplication.class, args);
    }
}
