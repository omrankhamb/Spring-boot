package com.example.SpringBootCoreDemo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication()
public class SpringBootCoreDemo2Application {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(SpringBootCoreDemo2Application.class, args);

		 OrderService orderService= context.getBean(OrderService.class);
		 orderService.PlaceOrder();

	}

}
