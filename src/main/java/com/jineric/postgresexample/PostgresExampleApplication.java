package com.jineric.postgresexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class PostgresExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostgresExampleApplication.class, args);
	}

}
