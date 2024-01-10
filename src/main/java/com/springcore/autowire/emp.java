package com.springcore.autowire;

public class emp {
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
