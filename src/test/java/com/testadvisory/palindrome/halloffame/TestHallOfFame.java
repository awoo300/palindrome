package com.testadvisory.palindrome.halloffame;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestHallOfFame {

	@Test
	public void testSetMember() {
		String [] members = {"Jack Mar","Bob Dole","Dapo Awo"};
		
		for (String everyperson : members){
				HallOfFame PalindromeXHallOfFame;
				PalindromeXHallOfFame = new PalindromeXHallOfFame();
				PalindromeXHallOfFame.setMember(everyperson);
				assertEquals(everyperson,PalindromeXHallOfFame.getMember());
		}
	}

}
