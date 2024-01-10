package com.springcore.scope;

import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("prototype")
public class Student {
	@Value("Faraz")
	private String StudentName;
	@Value("Mumbai")
	private String CityName;
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	@Override
	public String toString() {
		return "Student [StudentName=" + StudentName + ", CityName=" + CityName + "]";
	}
	public String getCityName() {
		return CityName;
	}
	public void setCityName(String cityName) {
		CityName = cityName;
	}
	public Student() {
		super();
		
	}
}
