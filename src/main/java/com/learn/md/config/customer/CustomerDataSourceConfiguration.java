package com.learn.md.config.customer;

import org.springframework.boot.autoconfigure.jdbc.*;
import org.springframework.boot.context.properties.*;
import org.springframework.context.annotation.*;

import javax.sql.*;

/**
 * @author Krishna Chaitanya
 */
@Configuration
public class CustomerDataSourceConfiguration {

    @Bean
    @ConfigurationProperties("spring.datasource.customer")
    public DataSourceProperties customerDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean
    @Primary
    public DataSource customerDataSource() {
        return customerDataSourceProperties()
                .initializeDataSourceBuilder()
                .build();
    }

}
