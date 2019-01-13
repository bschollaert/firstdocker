package first.docker.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"first.docker.controller","first.docker.dao.impl"})
public class MemberApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(MemberApplication.class, args);
	}
}
