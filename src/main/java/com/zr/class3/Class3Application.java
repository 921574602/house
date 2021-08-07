package com.zr.class3;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zr.class3.mapper")
public class Class3Application {

	public static void main(String[] args) {
		SpringApplication.run(Class3Application.class, args);
	}

}
