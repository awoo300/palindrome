package com.testadvisory.palindrome.integration;

import cucumber.api.*;
import cucumber.api.java.en.Given;




public class MyStepDefs {
	
	    @Given("I have (\\d+) cukes in my belly")
	    public void I_have_cukes_in_my_belly(int cukes) {
	        System.out.format("Cukes: %n\n", cukes);
	    
	}
}
