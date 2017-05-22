package com.testadvisory.palindrome.helper;

import java.io.*;

public class Helper {
	
	public String getUserInput(String input){
		String userInput = null;
		System.out.print(input + "");
		try
		{
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			userInput = is.readLine();
			
			if (userInput.length() == 0)
				return null;
		}
		catch (IOException e){
			System.out.print("IOExeption" + e);
		}
		
		
		return userInput;
	}
  
	

}
