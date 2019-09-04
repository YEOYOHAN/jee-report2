package com.report2.web.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.report2.web.pool.Constants;
import com.report2.web.domains.MemberBean;
import com.report2.web.domains.StudentBean;
import com.report2.web.serviceImpls.MemberServiceImpl;
import com.report2.web.services.MemberService;


@WebServlet("/member.do")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		switch (request.getParameter("action")) {
		
		case "move":
			request.getRequestDispatcher(String.format(Constants.VIEW_PATH,"student", request.getParameter("dest")))
			.forward(request, response);
			break;
		case "register":
			String name = request.getParameter("name");
			String ssn = request.getParameter("ssn");
			String kor = request.getParameter("kor");
			String eng = request.getParameter("eng");
			String math = request.getParameter("math");
			MemberBean param = new MemberBean();
			StudentBean param2 = new StudentBean();
			param2.setName(name);
			param2.setSsn(ssn);
			param.setKor(kor);
			param.setEng(eng);
			param.setMath(math);
			MemberService service = new MemberServiceImpl();
			//service.createReport(param);
			request.getRequestDispatcher(String.format(Constants.VIEW_PATH,"student", request.getParameter("dest")))
			.forward(request, response);
			System.out.println(param.toString());
			break;
		case "login":
			break;
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
