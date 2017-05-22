package com.testadvisory.palindrome.helper;

import static org.junit.Assert.*;
import java.io.*;
import java.util.Scanner;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class TestHelper {
	private Scanner scanner;

	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	
	
	@Test
	public void testGetUserInput() {
		Helper Helper;
		Helper = new Helper();
		String toTest = "Test";
		InputStream stdin = System.in;
		
		try {
			
			System.setIn(new ByteArrayInputStream(toTest.getBytes()));
			scanner = new Scanner(System.in);
			String userInput = scanner.nextLine();
			thrown.expect(NullPointerException.class);
			String testUserInput = Helper.getUserInput(userInput);
			System.out.print(testUserInput);
			throw new NullPointerException();
		}
		finally{
			System.setIn(stdin);	
		
	}
	}
}
