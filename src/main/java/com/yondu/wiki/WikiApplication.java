package com.yondu.wiki;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.yondu.wiki.config.RSAKeyProperties;

@SpringBootApplication
@EnableConfigurationProperties(RSAKeyProperties.class)
public class WikiApplication {

	public static void main(String[] args) {
		SpringApplication.run(WikiApplication.class, args);
	}

}
