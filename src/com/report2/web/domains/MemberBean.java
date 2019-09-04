package com.report2.web.domains;

import java.io.Serializable;

public class MemberBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String kor, eng, math, society, hap, average;

	public String getKor() {
		return kor;
	}

	public void setKor(String kor) {
		this.kor = kor;
	}

	public String getEng() {
		return eng;
	}

	public void setEng(String eng) {
		this.eng = eng;
	}

	public String getMath() {
		return math;
	}

	public void setMath(String math) {
		this.math = math;
	}

	public String getSociety() {
		return society;
	}

	public void setSociety(String society) {
		this.society = society;
	}

	public String getHap() {
		return hap;
	}

	public void setHap(String hap) {
		this.hap = hap;
	}

	public String getAverage() {
		return average;
	}

	public void setAverage(String average) {
		this.average = average;
	}

	@Override
	public String toString() {
		return "MemberBean [kor=" + kor + ", eng=" + eng + ", math=" + math + ", society=" + society + ", hap=" + hap
				+ ", average=" + average + "]";
	}

	
}
