package com.report2.web.services;

import com.report2.web.domains.StudentBean;

public interface StudentService {
	public void createReport(StudentBean param);
	public String createHakNum(StudentBean param);
	public String creatYear();
	public String creatSum(StudentBean param);
	public String creatAv(StudentBean param);
}
