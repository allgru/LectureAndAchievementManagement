package de.allangrunert.lam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories("de.allangrunert.lam.repositories.*")
@ComponentScan(basePackages = { "de.allangrunert.lam.*" })
@EntityScan("de.allangrunert.lam.entities.*")  
@SpringBootApplication
public class LamApplication {

	public static void main(String[] args) {
		SpringApplication.run(LamApplication.class, args);
	}

}
