package com.example.gspr01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@SpringBootApplication
@MapperScan(basePackages = "com.example.gspr01.mapper")
public class Gspr01Application {

	public static void main(String[] args) {
		SpringApplication.run(Gspr01Application.class, args);
	}

}
