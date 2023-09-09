package com.junit5.junit_mockito;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestLifeCycleExample 
{
    @BeforeAll
    static void init() {
    	System.out.println("Inside @BeforeAll");
    }
    
    @BeforeEach
     void start() {
    	System.out.println("Inside @BeforeEach");
    }
    
    @Test
    void testOne() {
    	System.out.println("Inside @Test testOne");
    }
    
    @Test
    void testTwo() {
    	System.out.println("Inside @Test testTwo");
    }
    
    @AfterEach
    void stop() {
    	System.out.println("Inside @AfterEach");
    }
    
    @AfterAll
    static void destroy() {
    	System.out.println("Inside @AfterAll");
    }
}
