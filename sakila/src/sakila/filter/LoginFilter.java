package sakila.filter;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.*;

@WebFilter("/auth/*")
public class LoginFilter implements Filter {
    public LoginFilter() {
        // TODO Auto-generated constructor stub
    }

	public void destroy() {
		// TODO Auto-generated method stub
	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("LoginFilter 실행 : session 검사");
		
		HttpSession session = ((HttpServletRequest)request).getSession();
		if (session.getAttribute("loginStaff") == null) {	// 로그인이 되어있지 않은 경우 확인
			System.out.println("로그인 후 접근하세요!");
			
			((HttpServletResponse)response).sendRedirect(request.getServletContext().getContextPath() + "/LoginServlet");
			return;
		}
		
		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}
}