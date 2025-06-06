package de.allangrunert.lam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@Configuration
@EntityScan
@EnableJpaRepositories
@ComponentScan("de.allangrunert.lam")
@SpringBootApplication
public class LamApplication {

	public static void main(String[] args) {
		SpringApplication.run(LamApplication.class, args);
	}

}
