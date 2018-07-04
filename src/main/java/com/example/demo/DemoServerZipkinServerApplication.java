package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import zipkin.server.EnableZipkinServer;

@EnableEurekaClient
@EnableZipkinServer
@SpringBootApplication
public class DemoServerZipkinServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoServerZipkinServerApplication.class, args);
	}
}
