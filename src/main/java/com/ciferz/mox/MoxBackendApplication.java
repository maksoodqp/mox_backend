package com.ciferz.mox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.ciferz.mox.repository")
public class MoxBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(MoxBackendApplication.class, args);
    }

}
