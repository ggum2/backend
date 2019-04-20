package xyz.hyunto.backend.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "xyz.hyunto.backend")
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(BackendApplication.class);
		springApplication.setWebApplicationType(WebApplicationType.SERVLET);
		springApplication.run(args);
	}

}

