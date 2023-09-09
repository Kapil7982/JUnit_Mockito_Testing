package com.junit5.junit_mockito;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)  // This annotation allow to create one object for all test method.
class InstanceVariableDemoInTest {

	static int i = 100;
	
	int j = 10;
	
	@BeforeEach
	void start() {
		System.out.println("#");
		i++;
		j--;
	}
	
	@Test
	void testOne() {
		System.out.println("Inside testOne, i = "+ i + " j = " + j);
	}
	
	@Test
	void testTwo() {
		System.out.println("Inside testTwo, i = "+ i + " j = " + j);
	}
	
	@AfterEach
	void stop() {
		System.out.println("$");
		i++;
		j--;
	}

}
