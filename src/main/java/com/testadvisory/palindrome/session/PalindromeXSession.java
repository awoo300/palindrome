package com.testadvisory.palindrome.session;


import com.testadvisory.palindrome.game.PalindromeX;
import java.util.Scanner;
import com.testadvisory.palindrome.helper.*;


public class PalindromeXSession extends Session {
	

	Helper Helper;
	
	public void run(){
		PalindromeX PalindromeX;
		Helper = new Helper();
		PalindromeX = new PalindromeX();
		startSession("PalidromeX");
		String welcomeMsg = PalindromeX.getWelcomeMessage();
	   	System.out.print(welcomeMsg + "\n");
	   	String enterName = Helper.getUserInput("Enter your name:" + "\n");
	   	PalindromeX.setPlayer(enterName);
	   	System.out.print("Yo " + enterName + "\n");
	   
			
		while (getIsStarted())
		{
			System.out.print("");
			String enterPalindrome = Helper.getUserInput("Enter a palindrome:" + "\n");
			PalindromeX.setPlayerEntry(enterPalindrome);
			PalindromeX.isPalindrome(enterPalindrome);
			System.out.print("Your score:" + PalindromeX.getPlayerScore() + "\n");
		}
			
	}
	
}
