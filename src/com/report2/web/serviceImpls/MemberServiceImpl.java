package com.report2.web.serviceImpls;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import com.report2.web.daolmpls.MemberDAOImpl;
import com.report2.web.daos.MemberDAO;
import com.report2.web.domains.MemberBean;
import com.report2.web.services.MemberService;

public class MemberServiceImpl implements MemberService{
	private MemberDAO dao;
	public MemberServiceImpl() {
		dao = new MemberDAOImpl();
	}
	@Override
	public void createReport(MemberBean param) {
		//param.setStudentNum(createHakNum(param));
		//param.setSum(creatSum(param));
		param.setAverage(creatAv(param));
		dao.insertStudent(param);
	}

	//@Override
	//public String createHakNum(MemberBean param) {
		//Random ran = new Random();
		//String flag = String.format("%s-%s%03d", creatYear(), param.getSsn().substring(7,8), ran.nextInt(999)+1);
		//return flag;
	//}

	@Override
	public String creatYear() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		String year = sdf.format(new Date());
		return year;
	}

	@Override
	public String creatSum(MemberBean param) {
		String sum2 = "";
		int sum = 0;
		int kor = Integer.parseInt(param.getKor());
		int eng = Integer.parseInt(param.getEng());
		int math = Integer.parseInt(param.getMath());
		sum = kor+eng+math;
		sum2 = String.valueOf(sum);
		return sum2;
	}

	@Override
	public String creatAv(MemberBean param) {
		String sum2 = "";
		int sum = 0;
		int kor = Integer.parseInt(param.getKor());
		int eng = Integer.parseInt(param.getEng());
		int math = Integer.parseInt(param.getMath());
		sum = (kor+eng+math)/3;
		sum2 = String.valueOf(sum);
		return sum2;
	}
	@Override
	public String createHakNum(MemberBean param) {
		// TODO Auto-generated method stub
		return null;
	}


}
