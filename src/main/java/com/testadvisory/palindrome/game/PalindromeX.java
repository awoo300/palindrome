package com.testadvisory.palindrome.game;

public class PalindromeX extends Game {
	
	
	private String playerPalindrome;
	private boolean isPalindrome;
	private String playerEntry;
	private double palindromeLenght;
	private double playerScore;
	private double playerTotal;

	
	
	
	public void setPlayerEntry(String playerEntry){
		this.playerEntry = playerEntry;
	}
	
	
	public void setPalindromeLenght(int palindromeLenght){
		this.palindromeLenght = palindromeLenght;
	}
	
	
	public String isPalindrome(String entry){
		StringBuilder palindrome = new StringBuilder(entry);
		palindrome.reverse().toString();
		playerPalindrome = palindrome.toString();
		setPalindromeLenght(playerPalindrome.length());
		
			
		if (entry.replace(" ", "").trim().equalsIgnoreCase(playerPalindrome.replace(" ", "").trim()))
			
			{
				isPalindrome = true; 
			}
	
		else 
				
			{	
				isPalindrome = false;
		
			}
			
		
		return playerPalindrome;
		
	}
	
	
	
	public double getPlayerScore(){
		
		if (isPalindrome()) 
		{
			
			playerScore = getPalindromeLenght() / 2;
		}
		
		else
		{
			System.out.println("Not a real palindrome. Try another: ");
		}
		
		return playerScore;
	}
	
	
	
	public void setPlayerTotal(double score){
		if (score != 0){
			
			playerTotal = score + playerTotal;
		}
		
	}
	
	
	public double getPlayerTotal(){
		return playerTotal;
	}
	
	
	
	public String getEntry(){
		return playerEntry;
}
	
	
	public boolean isPalindrome(){
		return isPalindrome;
	}

	
	public String getPlayerPalindrome() {
		return playerPalindrome;
	}
	
	
	public double getPalindromeLenght(){
		return palindromeLenght;
	}
}
