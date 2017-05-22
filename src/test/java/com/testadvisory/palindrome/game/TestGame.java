package com.testadvisory.palindrome.game;

import static org.junit.Assert.*;

import org.junit.Test;

import com.testadvisory.palindrome.session.PalindromeXSession;
import com.testadvisory.palindrome.session.Session;


public class TestGame {

	@Test
	public void testSetPlayerName() {
		Game PalindromeX;
		PalindromeX = new PalindromeX();
		PalindromeX.setPlayer("Joe Jackson");
		assertEquals("Joe Jackson",PalindromeX.getPlayer());
	}
	
	
	@Test
	public void testSetPlayerEntry(){
		PalindromeX PalindromeX;
		PalindromeX = new PalindromeX();
		PalindromeX.setPlayerEntry("Anna");
		assertEquals("Anna",PalindromeX.getEntry());
	}

	
	@Test
	public void testIsPalindrome(){
		PalindromeX PalindromeX;
		PalindromeX = new PalindromeX();
		PalindromeX.setPlayerEntry("Do geese see God");
		String palindrome = PalindromeX.isPalindrome(PalindromeX.getEntry());
		assertEquals(PalindromeX.getPlayerPalindrome(),palindrome);
		assertTrue("True Palindrome",PalindromeX.isPalindrome());
	}
	
	@Test
	public void testPalindromeLenght(){
		PalindromeX PalindromeX;
		PalindromeX = new PalindromeX();
		PalindromeX.setPlayerEntry("Civic");
		String palindrome = PalindromeX.isPalindrome(PalindromeX.getEntry());
		assertEquals(PalindromeX.getPlayerPalindrome(),palindrome);
		assertEquals(PalindromeX.getPalindromeLenght(),5,0.1);
		
	}
	
	@Test
	public void testGetPlayerScore(){
		PalindromeX PalindromeX;
		PalindromeX = new PalindromeX();
		PalindromeX.setPlayer("Jimmy Jones");
		PalindromeX.setPlayerEntry("civic");
		String palindrome = PalindromeX.isPalindrome(PalindromeX.getEntry());
		assertEquals(PalindromeX.getPlayerPalindrome(),palindrome);
		assertEquals(2.5,PalindromeX.getPlayerScore(),0.1);
	}
	
	
	@Test
	public void testGameStartShortcut(){
		Game PalindromeX;
		PalindromeX = new PalindromeX();
		PalindromeX.setStartShortcut("X");
		assertEquals("x",PalindromeX.getStartShortCut());
	}
	  
	@Test
	public void testWelcomeMessage(){
		PalindromeX PalindromeX;
		PalindromeX = new PalindromeX();
		String welcome = PalindromeX.getWelcomeMessage();
		assertEquals("Welcome to PalindromeX, the stage of champions!",welcome);
	}

	@Test
	public void testScoreTotal(){
		PalindromeX PalindromeX;
		PalindromeX  = new PalindromeX();
		String [] palindromes = {"Anna", "Civic","Kayak"};
		
		for (String eachPalindrome : palindromes){
			PalindromeX.setPlayer("John");
			PalindromeX.setPlayerEntry(eachPalindrome);
			eachPalindrome = PalindromeX.isPalindrome(eachPalindrome);
			double score = PalindromeX.getPlayerScore();
			PalindromeX.setPlayerTotal(score);
			double total = PalindromeX.getPlayerTotal();
			assertEquals(PalindromeX.getPlayerTotal(),total,0.1);
		}
		
	}
}
