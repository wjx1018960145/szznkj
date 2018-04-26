package com.szzn.action;

import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.spi.http.HttpContext;

import org.springframework.web.bind.annotation.ModelAttribute;

public class BaseController {
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
	HttpServletRequest request;
	HttpServletResponse response;
	protected HttpSession session;

	@ModelAttribute
	public void setReqAndRes(HttpServletRequest request,
			HttpServletResponse response) throws Exception{

		this.request = request;

		this.response = response;

		this.session = request.getSession();
	    
		this.session.setAttribute("loginTime", new Date());
		// System.out.println(this.session.getCreationTime());
		System.out.println("登录时间为：" + (Date) session.getAttribute("loginTime"));
		 this.response.setHeader("Access-Control-Allow-Origin", "*");
		this.response.setHeader("Access-Control-Allow-Headers",
				"X-Requested-With");
		///this.response.setHeader("Access-Control-Max-Age", "1728000");
		//this.response.setHeader("Access-Control-Allow-Methods", "*");
//		 if (this.request.getMethod().equals("OPTIONS")) {
//			 PrintWriter pw = this.response.getWriter();
//				//System.out.println(pw);
//				pw.println("");
//				pw.flush();
//				pw.close();
//		 
//		 }
		 this.response.setHeader("Access-Control-Allow-Methods","OPTIONS, POST, GET, DELETE,PATCH");
		this.response.setHeader("Access-Control-Max-Age", "2592000");
		this.response.setHeader("Access-Control-Allow-Headers",
				"Authentication");
		this.response
				.setHeader(
						"Access-Control-Allow-Headers",
						"Origin, No-Cache, X-Requested-With, If-Modified-Since, Pragma, Last-Modified, Cache-Control, Expires, Content-Type, X-E4M-With,userId,x-token,X-Token");
		this.response.setHeader("Access-Control-Allow-Credentials", "true");
		this.response.setHeader("Content-Type",
				"text/plain;charset=utf-8");
		//this.response.setContentType("text/plain;charset=utf-8");

	}
}
