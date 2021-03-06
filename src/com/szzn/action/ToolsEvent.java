package com.szzn.action;

import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import sun.security.util.PropertyExpander.ExpandException;

import com.szzn.server.ToolsService;
import com.szzn.server.ToolsServiceImp;

@Controller
@RequestMapping({ "/tools" })
public class ToolsEvent extends BaseController {
	@Resource
	ToolsService service;

	public ToolsEvent() {
		this.service = new ToolsServiceImp();
	}

	@RequestMapping({ "/selectAllinterface" })
	public void doit(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		if (this.request.getMethod().equals("OPTIONS")) {
			PrintWriter pw = this.response.getWriter();
			// System.out.println(pw);
			pw.println("");
			pw.flush();
			pw.close();

		} else {
			String token = request.getParameter("token");
			String reString = service.selectAllInterface(token);
			PrintWriter pw = this.response.getWriter();
			pw.println(reString);
			pw.flush();
			pw.close();
		}
	}

	@RequestMapping({ "/addinterface" })
	public void doit1(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		if (this.request.getMethod().equals("OPTIONS")) {
			PrintWriter pw = this.response.getWriter();
			// System.out.println(pw);
			pw.println("");
			pw.flush();
			pw.close();

		} else {

			String reString = service.addInterface(request);
			PrintWriter pw = this.response.getWriter();
			pw.println(reString);
			pw.flush();
			pw.close();
		}
	}

	@RequestMapping({ "/delinterface" })
	public void doit2(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		if (this.request.getMethod().equals("OPTIONS")) {
			PrintWriter pw = this.response.getWriter();
			// System.out.println(pw);
			pw.println("");
			pw.flush();
			pw.close();
		} else {
			String reString = service.delInterface(request);
			PrintWriter pw = this.response.getWriter();
			pw.println(reString);
			pw.flush();
			pw.close();
		}
	}
	@RequestMapping({"/creatInterface"})
	public void doit3(HttpServletRequest request, HttpServletResponse response)throws Exception{
		if (this.request.getMethod().equals("OPTIONS")) {
			PrintWriter pw = this.response.getWriter();
			// System.out.println(pw);
			pw.println("");
			pw.flush();
			pw.close();
		}else {
			String reString = service.creatInterface(request);
			PrintWriter pw = this.response.getWriter();
			pw.println(reString);
			pw.flush();
			pw.close();
		}
	}
	@RequestMapping({"/addProject"})
	public void doit4(HttpServletRequest request, HttpServletResponse response) throws Exception {
		if (this.request.getMethod().equals("OPTIONS")) {
			PrintWriter pw = this.response.getWriter();
			// System.out.println(pw);
			pw.println("");
			pw.flush();
			pw.close();
		}else {
			String reString = service.addProject(request);
			PrintWriter pw = this.response.getWriter();
			pw.println(reString);
			pw.flush();
			pw.close();
		}
	}
	@RequestMapping({"/selectAllPro"})
	public void	 doit5(HttpServletRequest request, HttpServletResponse response) throws Exception{
		String reString = service.selProject(request);
		PrintWriter pw = this.response.getWriter();
		pw.println(reString);
		pw.flush();
		pw.close();
	}
	@RequestMapping({"/selectProWithtoken"})
	public void	 doit6(HttpServletRequest request, HttpServletResponse response) throws Exception{
		String reString = service.selProjectWithToken(request);
		PrintWriter pw = this.response.getWriter();
		pw.println(reString);
		pw.flush();
		pw.close();
	}
	@RequestMapping({"/deleProWithtoken"})
	public void	 doit7(HttpServletRequest request, HttpServletResponse response) throws Exception{
		if (this.request.getMethod().equals("OPTIONS")) {
			PrintWriter pw = this.response.getWriter();
			// System.out.println(pw);
			pw.println("");
			pw.flush();
			pw.close();
		}else {
			String reString = service.delProject(request);
			PrintWriter pw = this.response.getWriter();
			pw.println(reString);
			pw.flush();
			pw.close();
		}
	}
	
	
}
