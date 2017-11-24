package com.itheima.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itheima.service.UserService;

public class ActiveServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//��ü�����
		String activeCode = request.getParameter("activeCode");
		
		UserService service = new UserService();
		service.active(activeCode);
		
		//��ת����¼ҳ��
		response.sendRedirect(request.getContextPath()+"/login.jsp");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}