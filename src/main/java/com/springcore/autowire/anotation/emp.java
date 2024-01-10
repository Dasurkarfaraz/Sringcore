package com.springcore.autowire.anotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class emp {
	
	@Autowired
	@Qualifier("address1")
private Address address;

@Override
public String toString() {
	return "emp [address=" + address + "]";
}

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}

public emp() {
	super();
}

}
