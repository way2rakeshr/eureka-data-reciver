package com.ocp.eureka.reciever;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaDataReceiverApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaDataReceiverApplication.class, args);
	}
}
