package com.github.phillipkruger.user.config;

import jakarta.annotation.sql.DataSourceDefinition;
import jakarta.ejb.Singleton;

@Singleton
@DataSourceDefinition(
    name = "java:global/PersonDS",
    className = "org.h2.jdbcx.JdbcDataSource",
    url = "jdbc:h2:mem:test;DB_CLOSE_DELAY=-1",
    user = "sa",
    password = "sa"
)
public class DataSourceConfig {
    // This class can be empty, as it only serves to define the DataSource
    // The DataSource will be automatically registered when this class is loaded
}

