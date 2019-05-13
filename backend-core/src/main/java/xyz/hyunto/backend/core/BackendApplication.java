package xyz.hyunto.backend.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) throws NoSuchFieldException {
//		SpringApplication springApplication = new SpringApplication(BackendApplication.class);
//		springApplication.setWebApplicationType(WebApplicationType.SERVLET);
//		springApplication.run(args);
        SpringApplication.run(BackendApplication.class, args);
	}

}

