package com.fortunebill.springBootClient.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ClientController {
	
	@Autowired
	org.springframework.cloud.client.discovery.DiscoveryClient discoveryClient;
	
	@SuppressWarnings("deprecation")
	@GetMapping("/dc")
	public String dc(){
		String services = "Services: " + discoveryClient.getServices();
        System.out.println(services);
        return services;
	}
}
