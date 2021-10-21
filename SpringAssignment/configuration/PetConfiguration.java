package com.te.springcorefirstassignment.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.springcorefirstassignment.classes.Pet;

@Configuration
public class PetConfiguration {
	
	@Bean("pet")
	public Pet getPet() {
		return new Pet();
		
	}

}
