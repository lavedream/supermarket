package com.flyjaky.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


public class LoginFilter implements Filter {

	private String strTokit="helloworld";
	
//	private Logger log=Logger.getLogger(LoginFilter.class);
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest hsr=(HttpServletRequest)arg0;
		String requestURI=hsr.getRequestURI();
		if(null != requestURI && !requestURI.equals("login.html")){
			HttpSession session=hsr.getSession();
			if(null == session.getAttribute("sessionToket")){
				session.setAttribute("sessionToket",this.strTokit);
				System.out.println("set session");
				arg0.getRequestDispatcher("/login.html").forward(arg0, arg1);
			}
		}

		
		arg2.doFilter(arg0, arg1);
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
