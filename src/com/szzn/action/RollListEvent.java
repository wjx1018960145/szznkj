package com.szzn.action;

import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.szzn.server.RollService;
import com.szzn.server.RollServiceImp;

@Controller
@RequestMapping({"/roll"})
public class RollListEvent extends BaseController {
	@Resource
	RollService service;

	public RollListEvent() {
		this.service = new RollServiceImp();
	}

	@RequestMapping({ "GetAllRoll" })
	public void getAlllink(HttpServletResponse response,
			HttpServletRequest request) throws Exception {
		super.setReqAndRes(request, response);
		String list = service.queryAll();
		PrintWriter pw = this.response.getWriter();
		System.out.println(pw);
		pw.println(list);
		pw.flush();
		pw.close();
	}

	@RequestMapping({ "findAll.do" })
	public void findAll(HttpServletResponse response, HttpServletRequest request)
			throws Exception {
		super.setReqAndRes(request, response);
		String list = service.findAll();
		PrintWriter pw = this.response.getWriter();
		System.out.println(pw);
		pw.println(list);
		pw.flush();
		pw.close();
	}

	@RequestMapping({ "addRoll" })
	public void addLink(HttpServletResponse response, HttpServletRequest request)
			throws Exception {
		String result = service.add(request);
		PrintWriter pw = this.response.getWriter();
		System.out.println(pw);
		pw.println(result);
		pw.flush();
		pw.close();
	}

	@RequestMapping({ "updateRoll" })
	public void updateLink(HttpServletResponse response,
			HttpServletRequest request) throws Exception {
		String result = service.update(request);
		PrintWriter pw = this.response.getWriter();
		System.out.println(pw);
		pw.println(result);
		pw.flush();
		pw.close();
	}

	@RequestMapping({ "deleteRoll" })
	public void deleteLink(HttpServletResponse response,
			HttpServletRequest request) throws Exception {
		String result = service.delete(request);
		PrintWriter pw = this.response.getWriter();
		System.out.println(pw);
		pw.println(result);
		pw.flush();
		pw.close();
	}
}
