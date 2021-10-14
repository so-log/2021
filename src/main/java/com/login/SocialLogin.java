package com.login;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

public abstract class SocialLogin {
	// code url 발급
	public abstract String getCodeURL(HttpServletRequest request);
	
	
	// access token발급
	public abstract String getAccessToken(HttpServletRequest request, String code, String state) throws Exception;
	public abstract String getAccessToken(HttpServletRequest request)throws Exception;
	
	// 회원 프로필 조회
	public abstract HashMap<String, String> getUserProfile(String accessToken);
}
