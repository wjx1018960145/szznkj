package com.szzn.action;

import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.szzn.server.UtilsService;
import com.szzn.server.UtilsServiceImp;



@Controller
@RequestMapping({ "/utils" })
public class UtilEvent extends BaseController {

	@Resource
	private UtilsService service;
	public UtilEvent(){
		this.service = new UtilsServiceImp();
	}
	@RequestMapping({"/all"})
	public void doit(HttpServletResponse response, HttpServletRequest request)throws Exception {
		super.setReqAndRes(request, response);
		String token = request.getParameter("token");
		String reString = service.queryAllCityPosition();
		PrintWriter pw = this.response.getWriter();
		System.out.println(pw);
		pw.println(reString);
		pw.flush();
		pw.close();
		
	}
	
	@RequestMapping({"/add"})
	public void doit1(HttpServletResponse response, HttpServletRequest request)throws Exception{
		super.setReqAndRes(request, response);
		 if (this.request.getMethod().equals("OPTIONS")) {
			 PrintWriter pw = this.response.getWriter();
				//System.out.println(pw);
				pw.println("");
				pw.flush();
				pw.close();
		 
		 }else {
			 String token = request.getParameter("token");
				String reString = service.addCity(request);
				PrintWriter pw = this.response.getWriter();
				System.out.println(pw);
				pw.println(reString);
				pw.flush();
				pw.close();
		 }
		
	}
	
	
	
}
