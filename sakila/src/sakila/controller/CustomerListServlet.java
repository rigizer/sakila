package sakila.controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import sakila.service.*;
import sakila.vo.*;

@WebServlet("/auth/CustomerListServlet")
public class CustomerListServlet extends HttpServlet {
	private StaffInfoService staffInfoService;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Debug: CustomerListServlet doGet 실행");
		
		request.getRequestDispatcher("/WEB-INF/views/auth/customer/customerList.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// doPost
	}
}