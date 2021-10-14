package com.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;

import com.login.*;


public class NaverController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		try {
			SocialLogin naver = new NaverLogin();
			naver.getAccessToken(request);
			
		} catch (Exception e) {
			out.printf("<script>alert('%s');</script>", e.getMessage());
		}
	}
}