package com.virtusa.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages= {"com.virtusa.demo"})
@SpringBootApplication
public class CmdRegExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(CmdRegExampleApplication.class, args);
	}

}
