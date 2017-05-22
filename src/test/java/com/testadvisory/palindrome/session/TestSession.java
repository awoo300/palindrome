package com.testadvisory.palindrome.session;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSession {

	@Test
	public void testStartSession() {
		Session PalindromeXSession;
		PalindromeXSession = new PalindromeXSession();
		PalindromeXSession.startSession("PalindromeX");
		assertTrue("Session not Started", PalindromeXSession.getIsStarted());
	}
	

}
