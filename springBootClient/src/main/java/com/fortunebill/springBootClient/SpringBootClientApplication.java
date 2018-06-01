package com.fortunebill.springBootClient;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient	
public class SpringBootClientApplication {  

	public static void main(String[] args) {
//		SpringApplication.run(SpringBootClientApplication.class, args);
		new SpringApplicationBuilder(
				SpringBootClientApplication.class)
	            .web(true).run(args);
	}
}
