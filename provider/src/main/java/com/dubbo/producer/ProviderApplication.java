package com.dubbo.producer;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.dubbo.api.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;


@ImportResource("classpath:/provider.xml")
@EnableDubbo
@SpringBootApplication
public class ProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProviderApplication.class, args);
	}

}
