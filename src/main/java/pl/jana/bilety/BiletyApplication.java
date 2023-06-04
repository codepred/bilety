package pl.jana.bilety;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("pl.jana.bilety.*")
@EntityScan("pl.jana.bilety.*")
public class BiletyApplication {

	public static void main(String[] args) {
		SpringApplication.run(BiletyApplication.class, args);
	}

}
