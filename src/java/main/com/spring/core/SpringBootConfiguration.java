package com.spring.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.spring.backend.MyEmbeddedServletContainerCustomizer;

@SpringBootApplication
@ComponentScan({ "com.spring.*" })
public class SpringBootConfiguration {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootConfiguration.class, args);
	}

	@Bean
	public EmbeddedServletContainerCustomizer embeddedServletCustomizer() {
		return new MyEmbeddedServletContainerCustomizer();
	}
}