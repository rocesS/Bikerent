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
		System.out.println("Zapisano w bazie bike1");

		Bike bike2 = new Bike(2L, "Scott Scala X, 27,5 cali męski", "STT12345", 25, 150);
		bikeRepository.save(bike2);
		System.out.println("Zapisano w bazie bike2");

		System.out.println("Usuwam z baz bike1");
		bikeRepository.deleteById(1L);

		System.out.println("Pobieram i wyświetlam bike1");
		bikeRepository.findById(1L).ifPresentOrElse(System.out::println, ()-> System.out.println("Brak roweru bike1"));

		bikeRepository.findById(2L).ifPresent(System.out::println);





	}



}
