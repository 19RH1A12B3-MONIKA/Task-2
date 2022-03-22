package com.motivity2;

public class Student {
	 
		private int student_id;
		private String student_name;
		private String student_address;
		private String student_mobile;
		
		
		
		@Override
		public String toString() {
			return "Student [student_Id=" + student_id + "  student_name=" + student_name + "  student_Address=" + student_address + "student_mobile"+student_mobile
					+ "]";
		}
		public int getStudent_id() {
			return student_id;
		}
		public void setStudent_id(int student_id) {
			this.student_id = student_id;
		}
		public String getStudent_name() {
			return student_name;
		}
		public void setStudent_name(String student_name) {
			this.student_name = student_name;
		}
		public String getStudent_address() {
			return student_address;
		}
		public void setStudent_address(String student_address) {
			this.student_address = student_address;
		}
		public String getStudent_mobile() {
			return student_mobile;
		}
		public void setStudent_mobile(String student_mobile) {
			this.student_mobile = student_mobile;
		}
		
		

	}
