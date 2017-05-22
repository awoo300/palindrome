package com.testadvisory.palindrome.game;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public abstract class Game {
	private String player;
	private String shortcut;
	private String message;
	
	
	public void setPlayer(String player){
		this.player = player;
	}
	
	
	public void setStartShortcut(String shortcut){
		this.shortcut = shortcut;
	}
	

	public String getPlayer(){
		return player;
	}
	
	
	public String getStartShortCut(){
		return shortcut.toLowerCase();
	}
	
	
	public String getWelcomeMessage(){
		Properties props = new Properties();
		InputStream file = null;
		ClassLoader ClassLoader = getClass().getClassLoader();
		
		try 
		{
			
		 file = ClassLoader.getResourceAsStream("palindrome.properties");
		 props.load(file);
		 message = props.getProperty("PalindromeXWelcomeMessage");
		
		}
		
		catch (IOException e)
		
		{
			e.printStackTrace();
		}
		
		finally 
		{
			if (file != null)
			{
				try
				{
					file.close();
				}
		 	
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}	
		
		return message;
	} 

}
