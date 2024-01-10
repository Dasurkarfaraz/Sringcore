package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class lifecycleExample {
	private String IOSTesting;
	private String AndroidTesting;
	public String getIOSTesting() {
		return IOSTesting;
	}
	public void setIOSTesting(String iOSTesting) {
		this.IOSTesting = iOSTesting;
	}
	public String getAndroidTesting() {
		return AndroidTesting;
	}
	public void setAndroidTesting(String androidTesting) {
		this.AndroidTesting = androidTesting;
	}
	public lifecycleExample(String iOSTesting, String androidTesting) {
		super();
		this.IOSTesting = iOSTesting;
		this.AndroidTesting = androidTesting;
	}
	public lifecycleExample() {
		super();
	}
	@Override
	public String toString() {
		return "lifecycleExample [IOSTesting=" + IOSTesting + ", AndroidTesting=" + AndroidTesting + "]";
	}
	
	@PostConstruct
	public void start() {
		System.out.println("In Start");
	}
	
	
	@PreDestroy
	public void ENd() {
		System.out.println("In End");
	}

	

}
