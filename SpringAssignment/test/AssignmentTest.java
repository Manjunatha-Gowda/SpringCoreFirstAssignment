package com.te.springcorefirstassignment.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.springcorefirstassignment.classes.Pet;
import com.te.springcorefirstassignment.configuration.AllConfiguration;

public class AssignmentTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AllConfiguration.class);
		Pet pet = (Pet) context.getBean("pet");
		System.out.println("Lion Pet ID " + pet.getPid());
		pet.getAnimal().eat();
		pet.getAnimal().walk();
		pet.getAnimal().sleep();
		System.out.println();
		pet.getAnimal2().eat();
		pet.getAnimal2().walk();
		pet.getAnimal2().sleep();
	}

}
