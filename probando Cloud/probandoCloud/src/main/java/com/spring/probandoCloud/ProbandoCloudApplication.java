package com.spring.probandoCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ProbandoCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProbandoCloudApplication.class, args);
	}

}
