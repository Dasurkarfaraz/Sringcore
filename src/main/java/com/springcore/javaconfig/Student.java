package com.springcore.javaconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Value("Faraz")
	private String SName;
	@Value("54")
	private int SID;
	public String getSName() {
		return SName;
	}
	public void setSName(String sName) {
		SName = sName;
	}
	public int getSID() {
		return SID;
	}
	public void setSID(int sID) {
		SID = sID;
	}
	public Student(String sName, int sID) {
		super();
		SName = sName;
		SID = sID;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [SName=" + SName + ", SID=" + SID + "]";
	}
	

}
