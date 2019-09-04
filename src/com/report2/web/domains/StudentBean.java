package com.report2.web.domains;

import java.io.Serializable;

public class StudentBean implements Serializable{

	private static final long serialVersionUID = 1L;

	private String name, ssn, studentNum;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(String studentNum) {
		this.studentNum = studentNum;
	}

	@Override
	public String toString() {
		return "StudentBean [name=" + name + ", ssn=" + ssn + ", studentNum=" + studentNum + "]";
	}

	
}
