package com.report2.web.services;

import com.report2.web.domains.MemberBean;

public interface MemberService {
	public void createReport(MemberBean param);
	public String createHakNum(MemberBean param);
	public String creatYear();
	public String creatSum(MemberBean param);
	public String creatAv(MemberBean param);
}
