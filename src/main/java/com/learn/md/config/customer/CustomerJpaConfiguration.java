package com.learn.md.config.customer;

import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.orm.jpa.*;
import org.springframework.context.annotation.*;
import org.springframework.data.jpa.repository.config.*;
import org.springframework.orm.jpa.*;
import org.springframework.transaction.*;
import org.springframework.transaction.annotation.*;

import javax.sql.*;
import java.util.*;

/**
 * @author Krishna Chaitanya
 */
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        basePackages = {"com.learn.md.repository.customer"},
        entityManagerFactoryRef = "customerEntityManagerFactory",
        transactionManagerRef = "customerTransactionManager"
)
public class CustomerJpaConfiguration {

    @Bean
    public LocalContainerEntityManagerFactoryBean customerEntityManagerFactory(
            @Qualifier("customerDataSource") DataSource dataSource,
            EntityManagerFactoryBuilder entityManagerFactoryBuilder) {
        return entityManagerFactoryBuilder
                .dataSource(dataSource)
                .packages("com.learn.md.model.customer")
                .build();
    }

    @Bean
    public PlatformTransactionManager customerTransactionManager(
            @Qualifier("customerEntityManagerFactory") LocalContainerEntityManagerFactoryBean customerEntityManagerFactory) {
        return new JpaTransactionManager(Objects.requireNonNull(customerEntityManagerFactory.getObject()));
    }

}
