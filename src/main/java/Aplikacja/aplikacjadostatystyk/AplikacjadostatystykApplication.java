package Aplikacja.aplikacjadostatystyk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.CrossOrigin;


@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
@EnableScheduling
public class AplikacjadostatystykApplication {
	public static void main(String[] args) {
		SpringApplication.run(AplikacjadostatystykApplication.class, args);
	}

}
