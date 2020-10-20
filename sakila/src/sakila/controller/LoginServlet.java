package sakila.controller;

import java.io.IOException;
import java.util.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import sakila.service.*;
import sakila.vo.*;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private StatsService statsService;
	
	// loginForm.jsp로 이동
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		if (session.getAttribute("loginStaff") != null) {	// 로그인이 된 상태인지 확인
			response.sendRedirect(request.getContextPath() + "/auth/IndexServlet");
		
			return;
		}
		
		statsService = new StatsService();
		//Stats stats = statsService.getStats();
		Map<String, Object> map = statsService.getStats();
		
		//request.setAttribute("stats", stats);
		request.setAttribute("todayStats", map.get("todayStats"));
		request.setAttribute("totalCount", map.get("totalCount"));
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	}

	// loginAction.jsp로 이동
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}
}