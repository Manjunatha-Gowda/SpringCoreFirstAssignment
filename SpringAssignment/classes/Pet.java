package com.te.springcorefirstassignment.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import lombok.Data;

@Data
public class Pet {
	@Value("105")
	private int pid;
	@Autowired
	@Qualifier("lion")
	private Animal animal;
	@Autowired
	@Qualifier("cat")
	private Animal animal2;

}
