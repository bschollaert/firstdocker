package first.docker.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages = {"first.docker.controller"})
public class MemberApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(MemberApplication.class, args);
	}
}
