package com.example.springbootemployeeapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringbootemployeeapiApplication {
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootemployeeapiApplication.class, args);
		//System.out.println("hello from);
	}
	

}
