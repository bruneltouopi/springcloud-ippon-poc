package com.example.springcloudipponpoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableAutoConfiguration
@EnableZuulProxy
public class ZuulServerApplication {

	public static void main(String[] args) {

		SpringApplication.run(ZuulServerApplication.class, args);
	}

}

