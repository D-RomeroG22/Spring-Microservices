package com.microservice.courses;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MicroserviceCoursesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceCoursesApplication.class, args);
	}

}
