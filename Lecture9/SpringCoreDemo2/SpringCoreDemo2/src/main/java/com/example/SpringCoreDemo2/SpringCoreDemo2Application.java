package com.example.SpringCoreDemo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.annotation.Order;

@SpringBootApplication
public class SpringCoreDemo2Application {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(SpringCoreDemo2Application.class, args);

		System.out.println("Spring Core Demo2 Application Started");


		OrderService order = context.getBean(OrderService.class);
		order	.placeorder();

	}

}
