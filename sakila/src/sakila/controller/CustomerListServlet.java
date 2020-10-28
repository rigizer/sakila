package sakila.controller;

import java.io.*;
import java.util.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import sakila.service.*;
import sakila.vo.*;

@WebServlet("/auth/CustomerListServlet")
public class CustomerListServlet extends HttpServlet {
	private CustomerListService customerListService;
	
	private int currentPage = 1;
	private int pagePerRow = 10;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Debug: CustomerListServlet doGet 실행");
		
		customerListService = new CustomerListService();
		System.out.println("Debug: CustomerList 객체 생성");
		
		ArrayList<CustomerList> returnCustomerList = customerListService.getCustomerList(currentPage, pagePerRow);	// 회원 목록을 불러온다.
		System.out.println("Debug: returnCustomerList(" + returnCustomerList + ")");
		
		if (returnCustomerList != null) {	// 회원 목록 데이터를 검색했을 경우
			request.setAttribute("customerList", returnCustomerList);	// request에 customerList 데이터를 담음
		}
		
		request.getRequestDispatcher("/WEB-INF/views/auth/customer/customerList.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// doPost
	}
}