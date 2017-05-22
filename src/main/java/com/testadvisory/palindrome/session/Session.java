package com.testadvisory.palindrome.session;

import java.io.*;
import java.util.Properties;

public abstract class Session implements Runnable {
	private boolean isStarted;
	

	
	public void startSession(String gameName){ 
		System.out.print(gameName + "session started");
		isStarted = true;
	}
	

	public boolean getIsStarted(){
		return isStarted;
	}
	
	
	
}

