package com.testadvisory.palindrome.session;


public class GameSession {

	public static void main(String[] args) {
		(new Thread(new PalindromeXSession())).start();

	}

}
