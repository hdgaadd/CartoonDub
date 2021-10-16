package com.codeman;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.codeman.mapper")
//超能勇士
public class RelaxApplication {

	public static void main(String[] args) {
		SpringApplication.run(RelaxApplication.class, args);
	}

}
