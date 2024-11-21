package com.example.lab1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lab1Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Lab1Application.class, args);
	}

	public void run(String... args) throws Exception{
		Discriminant Discriminant = new Discriminant();
		System.out.printf("D = %d^2 - 4*%d*%d = %d", Discriminant.getB(), Discriminant.getA(),
				Discriminant.getC() ,Discriminant.getResult());
		if(Discriminant.getResult()<0) System.out.printf("\nD<0");
	}
}
