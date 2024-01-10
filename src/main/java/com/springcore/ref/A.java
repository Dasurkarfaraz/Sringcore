package com.springcore.ref;

public class A {
	
	private String y ;
	private B ob;
	public String gety() {
		return y;
	}
	public void sety(String y) {
		this.y = y;
	}
	public B getOb() {
		return ob;
	}
	public void setOb(B ob) {
		this.ob = ob;
	}
	public A(String y, B ob) {
		super();
		this.y = y;
		this.ob = ob;
	}
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
