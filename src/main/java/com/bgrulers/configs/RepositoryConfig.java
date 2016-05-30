package com.bgrulers.configs;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.bgrulers.entity"})
@EnableJpaRepositories(basePackages = {"com.bgrulers.repository"})
@EnableTransactionManagement
@Import(RepositoryRestMvcConfiguration.class)
public class RepositoryConfig {
}