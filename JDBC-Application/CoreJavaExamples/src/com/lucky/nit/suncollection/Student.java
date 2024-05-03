package com.lucky.nit.suncollection;

import java.io.Serializable;

public class Student implements Serializable{
     private int sno;
     private String sname;
     private String Course;
     private double fee;
	public Student() {
		
	}
	
	public Student(int sno, String sname, String course, double fee) {
		
		this.sno = sno;
		this.sname = sname;
		Course = course;
		this.fee = fee;
	}

	public Student(int sno, String course) {
		
		this.sno = sno;
		Course = course;
	}

	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		Course = course;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student s)
			return this.Course.equals(s.Course) && this.sno == s.sno;
		
		return false;
	}
    
	@Override
	public String toString() {
		return "\nStudent (" + sno + ", " + sname + ", " + Course + ", " + fee + ")";
	}
     
     
}
