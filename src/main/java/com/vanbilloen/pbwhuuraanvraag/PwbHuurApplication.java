package com.vanbilloen.pbwhuuraanvraag;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(value = {"com.vanbilloen.pbwhuuraanvraag.databases", "com.vanbilloen.pbwhuuraanvraag.model", "com.vanbilloen.pbwhuuraanvraag.services","com.vanbilloen.pbwhuuraanvraag.controllers"})
@SpringBootApplication
public class PwbHuurApplication {

    public static void main(String[] args) {
        SpringApplication.run(PwbHuurApplication.class, args);
    }

}

