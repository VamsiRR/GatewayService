package com.vamsi.gatewayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ApigatewayApplication {

	public static void main(String[] args)
	{
		System.out.println("Hello! feature");
		SpringApplication.run(ApigatewayApplication.class, args);
	}

}
