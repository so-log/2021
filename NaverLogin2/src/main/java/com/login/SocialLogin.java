package com.login;

import java.util.HashMap;
import java.net.*;
import java.io.*;

import javax.servlet.http.HttpServletRequest;

public abstract class SocialLogin {
	// code url 발급
	public abstract String getCodeURL(HttpServletRequest request);
	
	
	// access token발급
	public abstract String getAccessToken(HttpServletRequest request, String code, String state) throws Exception;
	public abstract String getAccessToken(HttpServletRequest request) throws Exception;
	
	// 회원 프로필 조회
	public abstract HashMap<String, String> getUserProfile(String accessToken);
	
	
	public void httpRequest(String apiURL) throws Exception {
		URL url = new URL(apiURL);
		HttpURLConnection conn = (HttpURLConnection)url.openConnection();
		conn.setRequestMethod("GET");
		
		int statusCode = conn.getResponseCode();
		InputStream in;
		if (statusCode == HttpURLConnection.HTTP_OK) {
			in = conn.getInputStream();
		} else {
			in = conn.getErrorStream();
		}
		
		StringBuilder sb = null;
		try (in;
			InputStreamReader isr = new InputStreamReader(in);
			BufferedReader br = new BufferedReader(isr)) {
			
			String line; 
			sb = new StringBuilder();
			while ((line = br.readLine()) != null) {
				sb.append(line);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
 		
		String html = sb.toString();
		
	}

		
	
	
	
}