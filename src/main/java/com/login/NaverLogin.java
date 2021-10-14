package com.login;

import java.net.URLEncoder;
import java.util.HashMap;

import javax.servlet.FilterConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class NaverLogin extends SocialLogin {
	
	private static String clientId;
	private static String clientSecret;
	private static String callbackUrl;
	
	public static void init(FilterConfig config) throws Exception {
		init(
				config.getInitParameter("NaverClientId"),
				config.getInitParameter("NaverClientSecret"),
				config.getInitParameter("NaverCallbackUrl")
			);
	}
	
	public static void init(String clientId, String clientSecret, String callbackURL) throws Exception {
		NaverLogin.clientId = clientId;
		NaverLogin.clientSecret = clientSecret;
		NaverLogin.callbackUrl = URLEncoder.encode(callbackURL, "UTF-8");
	}
	
	@Override
	public String getCodeURL(HttpServletRequest request) {
		long state = System.currentTimeMillis();
		
		HttpSession session = request.getSession();
		session.setAttribute("state", state);
		
		StringBuilder sb = new StringBuilder();
		sb.append("https://nid.naver.com/oauth2.0/authorize?");
		sb.append("response_type=code");
		sb.append("&client_id=");
		sb.append(clientId);
		sb.append("&redirect_uri=");
		sb.append(callbackUrl);
		sb.append("&state=");
		sb.append(state);
		
		return sb.toString();
	}

	@Override
	public String getAccessToken(HttpServletRequest request, String code, String state) throws Exception {
		
		HttpSession session = request.getSession();
		String _state = String.valueOf((Long)session.getAttribute("state"));
		if(!state.equals(_state)) {
			throw new Exception("데이터가 변조됐습니다.");
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append("https://nid.naver.com/oauth2.0/token?");
		sb.append("grant_type=authorization_code");
		sb.append("&client_id=");
		sb.append(clientId);
		sb.append("&client_secret=");
		sb.append("clientSecret");
		sb.append("&redirect_uri=");
		sb.append(callbackUrl);
		sb.append("&state=");
		sb.append(state);
		
		return sb.toString();
		
	}
	
	@Override
	public String getAccessToken(HttpServletRequest request) throws Exception {
		
		String code = request.getParameter("code");
		String state = request.getParameter("state");
		
		return getAccessToken(request, code, state);
	}
	
	@Override
	public HashMap<String, String> getUserProfile(String accessToken) {
		// TODO Auto-generated method stub
		return null;
	}
}
