package com.testadvisory.palindrome.halloffame;

import java.util.*;

public abstract class HallOfFame {
	private String member;
	ArrayList <String> ListOfMembers;

	public void setMember(String member){
		this.member = member;
		ListOfMembers = new ArrayList<String>();
		ListOfMembers.add(member);
	}
	
	
	public String getMember(){
		return member;
	}
}
