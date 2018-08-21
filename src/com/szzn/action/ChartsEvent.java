package com.szzn.action;

import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.szzn.server.ChartsService;
import com.szzn.server.ChartsServiceImp;

@Controller
@RequestMapping({ "/chaert" })
public class ChartsEvent extends BaseController {
	
	@Resource
	private ChartsService service;
	public ChartsEvent(){
		this.service = new ChartsServiceImp();
	}
	
	public void doit(HttpServletRequest request, HttpServletResponse response)throws Exception {
		String token = request.getParameter("token");
		String reString = service.getDayActive(request);
		PrintWriter pw = this.response.getWriter();
		pw.println(reString);
		pw.flush();
		pw.close();
	}
	
	
	

}
