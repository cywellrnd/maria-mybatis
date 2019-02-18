package com.cywellsystem.cis.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.cywellsystem.cis")
public class CisApplication {

	public static void main(String[] args) {
		SpringApplication.run(CisApplication.class, args);
	}


}
