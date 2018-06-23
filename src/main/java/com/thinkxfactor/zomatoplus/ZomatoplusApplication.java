package com.thinkxfactor.zomatoplus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ComponentScan("com.thinkxfactor")
public class ZomatoplusApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZomatoplusApplication.class, args);
	}

}
