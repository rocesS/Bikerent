package com.example.bikerent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.sql.SQLOutput;

@SpringBootApplication
public class BikerentApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(BikerentApplication.class, args);
		Bike bike1 = new Bike(1L, "Kross Esker 4.0, 29 cali męski", "KRS12345", 30, 100);
		BikeRepository bikeRepository = context.getBean(BikeRepository.class);
		bikeRepository.save(bike1);







	}



}
