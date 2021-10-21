package com.te.springcorefirstassignment.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.springcorefirstassignment.classes.Animal;
import com.te.springcorefirstassignment.classes.Cat;
import com.te.springcorefirstassignment.classes.Lion;

@Configuration
public class AnimalConfiguration {
	
	@Bean("lion")
	public Animal getLion() {
		return new Lion();
		
	}
	
	@Bean("cat")
	public Animal getCat() {
		return new Cat();
		
	}

}
