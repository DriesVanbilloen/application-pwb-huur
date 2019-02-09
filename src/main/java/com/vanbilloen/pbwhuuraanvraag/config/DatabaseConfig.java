package com.vanbilloen.pbwhuuraanvraag.config;

import org.postgresql.ds.PGSimpleDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@Configuration
public class DatabaseConfig {

    @Bean
    public DataSource dataSource() throws SQLException {
        PGSimpleDataSource basicDataSource = new PGSimpleDataSource();
        basicDataSource.setUrl("jdbc:postgresql://ec2-46-137-170-51.eu-west-1.compute.amazonaws.com:5432/dctv79frlqboaq");
        basicDataSource.setUser("hzhepuignvadmn");
        basicDataSource.setPassword("476d4a99d9e7a0a47c7c4f2f51a9c368ccf417533b19a4424f7bb715d93d43b6");
        return basicDataSource;
    }
}
