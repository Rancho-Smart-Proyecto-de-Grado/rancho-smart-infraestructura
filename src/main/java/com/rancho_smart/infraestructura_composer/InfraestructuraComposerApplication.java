package com.rancho_smart.infraestructura_composer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class InfraestructuraComposerApplication {

	public static void main(String[] args) {
		SpringApplication.run(InfraestructuraComposerApplication.class, args);
	}

}
