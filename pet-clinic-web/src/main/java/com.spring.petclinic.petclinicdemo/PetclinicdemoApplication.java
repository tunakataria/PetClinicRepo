package com.spring.petclinic.petclinicdemo;

import com.spring.petclinic.petclinicdemo.config.ExternalDataConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PetclinicdemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(PetclinicdemoApplication.class, args);

		System.out.println(ctx.getBean(ExternalDataConfig.class).getFirstName());
	}
}
