package com.mallo.index;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class MysqlIndexApplication {

	public static void main(String[] args) {
		SpringApplication.run(MysqlIndexApplication.class, args);
	}
}
