package com.report2.web.doalmpls;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.report2.web.doas.StudentDAO;
import com.report2.web.domains.StudentBean;

public class StudentDAOImpl implements StudentDAO{
	public static final String FILE_PATH = String.format("C:%sUsers%suser%seclipse-jee%sjee-report2%sWebContent%sresources%stxt%s",
			File.separator,
			File.separator,
			File.separator,
			File.separator,
			File.separator,
			File.separator,
			File.separator,
			File.separator);
	@Override
	public void insertStudent(StudentBean param) {
		try {
			File file = new File(FILE_PATH+"report2.txt");
			BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
			writer.write(String.format("%s %s %s %s %s %s %s", param.getName(),
					param.getStudentNum(), param.getKor(), param.getEng(), param.getMath(), param.getSum(), param.getAverage()));
			writer.newLine();
			writer.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
