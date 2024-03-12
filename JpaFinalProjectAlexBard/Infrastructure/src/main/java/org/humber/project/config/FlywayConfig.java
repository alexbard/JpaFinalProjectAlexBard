package org.humber.project.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.flywaydb.core.Flyway;

import javax.sql.DataSource;

@Configuration
public class FlywayConfig {

    private final DataSource dataSource;

    @Autowired
    public FlywayConfig(DataSource dataSource) {
        this.dataSource = dataSource;
        runFlywayMigration();
    }

    private void runFlywayMigration() {
        Flyway flyway = Flyway.configure()
                .dataSource(dataSource)
                .load();
        flyway.repair();
    }
}
