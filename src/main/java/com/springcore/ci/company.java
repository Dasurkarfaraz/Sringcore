package com.springcore.ci;

import java.util.List;

public class company {
	
	private String Companyname;
	private int 	taxpaid;
	private int	Companyphonenumber;
	private List<String> Companyaddress;
	
	
	
	public company(String companyname, int taxpaid, int companyphonenumber, List<String> Companyaddress) {
		super();
		this.Companyname = companyname;
		this.taxpaid = taxpaid;
		this.Companyphonenumber = companyphonenumber;
		this.Companyaddress = Companyaddress;
	}


	@Override
	public String toString() {
		return "company [Companyname=" + Companyname + ", taxpaid=" + taxpaid + ", Companyphonenumber="
				+ Companyphonenumber + Companyaddress +"]";
	}
	
	
	
	
}
