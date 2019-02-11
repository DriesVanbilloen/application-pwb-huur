package com.vanbilloen.pbwhuuraanvraag;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan("com.vanbilloen.pbwhuuraanvraag.databases")
@ComponentScan("com.vanbilloen.pbwhuuraanvraag.model")
@SpringBootApplication
public class PwbHuurApplication {

    public static void main(String[] args) {
        SpringApplication.run(PwbHuurApplication.class, args);
    }

}

