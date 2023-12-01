package com.learn.md.config.restaurant;

import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.orm.jpa.*;
import org.springframework.context.annotation.*;
import org.springframework.data.jpa.repository.config.*;
import org.springframework.orm.jpa.*;
import org.springframework.transaction.*;

import javax.sql.*;
import java.util.*;

/**
 * @author Krishna Chaitanya
 */
@Configuration
@EnableJpaRepositories(
        basePackages = "com.learn.md.repository.restaurant",
        entityManagerFactoryRef = "restaurantEntityManagerFactory",
        transactionManagerRef = "restaurantTransactionManager"
)
public class RestaurantJpaConfiguration {

    @Bean
    public LocalContainerEntityManagerFactoryBean restaurantEntityManagerFactory(
            @Qualifier("restaurantDataSource") DataSource dataSource,
            EntityManagerFactoryBuilder entityManagerFactoryBuilder) {
        return entityManagerFactoryBuilder
                .dataSource(dataSource)
                .packages("com.learn.md.model.restaurant")
                .build();
    }

    @Bean
    public PlatformTransactionManager restaurantTransactionManager(
            @Qualifier("restaurantEntityManagerFactory") LocalContainerEntityManagerFactoryBean restaurantEntityManagerFactory) {
        return new JpaTransactionManager(Objects.requireNonNull(restaurantEntityManagerFactory.getObject()));
    }

}
