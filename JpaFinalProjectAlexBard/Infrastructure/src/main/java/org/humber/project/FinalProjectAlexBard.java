package org.humber.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "org.humber.project")
@ComponentScan("org.humber.project.domain")
@EnableJpaRepositories(basePackages = "org.humber.project.repositories")
public class FinalProjectAlexBard {

    public static void main(String[] args) {
        SpringApplication.run(FinalProjectAlexBard.class, args);
    }

}