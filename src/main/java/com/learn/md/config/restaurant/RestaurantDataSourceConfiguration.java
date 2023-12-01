package com.learn.md.config.restaurant;

import org.springframework.boot.autoconfigure.jdbc.*;
import org.springframework.boot.context.properties.*;
import org.springframework.context.annotation.*;

import javax.sql.*;

/**
 * @author Krishna Chaitanya
 */
@Configuration
public class RestaurantDataSourceConfiguration {

    @Bean
    @ConfigurationProperties("spring.datasource.restaurant")
    public DataSourceProperties restaurantDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean
    public DataSource restaurantDataSource() {
        return restaurantDataSourceProperties()
                .initializeDataSourceBuilder()
                .build();
    }

}
