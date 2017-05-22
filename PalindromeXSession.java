package com.testadvisory.palindrome.session;

import com.testadvisory.palindrome.game.*;
import java.util.Scanner;

public class PalindromeXSession extends Session {
	public void run(){
		PalindromeX PalindromeX;
		Scanner Scanner;
		Scanner = new Scanner(System.in);
		PalindromeX = new PalindromeX();
		System.out.print(PalindromeX.WELCOMEMSG);
		System.out.print("Enter your name:" + "\n");
		String name = Scanner.nextLine();
		PalindromeX.setPlayer(name);
		System.out.print("Welcome " + name + "\n");
		System.out.print("Enter a palindrome:" + "\n");
		String palindrome = Scanner.nextLine();
		PalindromeX.setPlayerEntry(palindrome);
		PalindromeX.isPalindrome(palindrome);
		System.out.print("Your score:" + PalindromeX.getPlayerScore());
	}

}
