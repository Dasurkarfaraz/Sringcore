package com.springcore;

public class Student {
		private int StudentId;
		private String StudentName;
		private String studentAddress;
		public int getStudentId() {
			return StudentId;
		}
		public void setStudentId(int studentId) {
			StudentId = studentId;
		}
		public String getStudentName() {
			return StudentName;
		}
		public void setStudentName(String studentName) {
			StudentName = studentName;
		}
		public String getStudentAddress() {
			return studentAddress;
		}
		public void setStudentAddress(String studentAddress) {
			this.studentAddress = studentAddress;
		}
		public Student(int studentId, String studentName, String studentAddress) {
			super();
			StudentId = studentId;
			StudentName = studentName;
			this.studentAddress = studentAddress;
		}
		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Student [StudentId=" + StudentId + ", StudentName=" + StudentName + ", studentAddress="
					+ studentAddress + "]";
		}
		
		

}
