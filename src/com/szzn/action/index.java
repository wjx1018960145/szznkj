package com.szzn.action;

import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.szzn.server.IndexService;
import com.szzn.server.IndexServiceImp;

@Controller
@RequestMapping({"/index"})
public class index extends BaseController{
	@Resource
	private IndexService service;
	public index(){
		this.service = new IndexServiceImp();
	}
	
	@RequestMapping({"/menus"})
	public void todo(HttpServletResponse response, HttpServletRequest request) throws Exception{
		super.setReqAndRes(request, response);
		String list = service.menus();
		PrintWriter pw = this.response.getWriter();
		System.out.println(pw);
		pw.println(list);
		pw.flush();
		pw.close();
	}
	
}
