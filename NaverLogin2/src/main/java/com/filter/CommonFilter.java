package com.filter;

import javax.servlet.*;

import com.login.NaverLogin;

import java.io.*;


public class CommonFilter implements Filter {
	public void init(FilterConfig filterconfig) throws ServletException {
		try {
			NaverLogin.init(filterconfig);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
		
		chain.doFilter(request, response);
	}
}
