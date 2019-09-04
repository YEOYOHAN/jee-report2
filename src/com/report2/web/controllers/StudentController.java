package com.report2.web.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.report2.web.domains.MemberBean;
import com.report2.web.domains.StudentBean;
import com.report2.web.serviceImpls.MemberServiceImpl;
import com.report2.web.services.MemberService;

@WebServlet("/student.do")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String studentNum = request.getParameter("studentNum");
		StudentBean param = new StudentBean();
		param.setName(name);
		param.setStudentNum(studentNum);
		MemberService service = new MemberServiceImpl();
		//service.createReport(param);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
