package com.szzn.action;

import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import com.szzn.mode.*;
import com.szzn.server.UserService;
import com.szzn.server.UserServiceImp;
import com.szzn.utils.Encipher;

@Controller
@RequestMapping({"/user"})
public class UserEvent extends BaseController{
	@Resource
	private UserService service;
	public UserEvent(){
		this.service = new UserServiceImp();
	}
	
	@RequestMapping({"/login"})
	public void doit(HttpServletResponse response, HttpServletRequest request)throws Exception{
		super.setReqAndRes(request, response);
		 if (this.request.getMethod().equals("OPTIONS")) {
			 PrintWriter pw = this.response.getWriter();
				//System.out.println(pw);
				pw.println("");
				pw.flush();
				pw.close();
		 
		 }else {
			 String userid = request.getParameter("username");
				String userpw = request.getParameter("password");
				String longitude = request.getParameter("longitude");
				String dimension = request.getParameter("dimension");
				User user = new User();
				user.setPassword(Encipher.md5(userpw));
				user.setUserid(userid);
				user.setLongitude(longitude);
				user.setDimension(dimension);
				String reString = service.login(user);
				PrintWriter pw = this.response.getWriter();
				System.out.println(pw);
				pw.println(reString);
				pw.flush();
				pw.close();
		}
	}
	@RequestMapping({"/Info"})
	public void doit1(HttpServletResponse response, HttpServletRequest request)throws Exception {
		super.setReqAndRes(request, response);
		String token = request.getParameter("token");
		String reString = service.info(token);
		PrintWriter pw = this.response.getWriter();
		System.out.println(pw);
		pw.println(reString);
		pw.flush();
		pw.close();
		
	}
	@RequestMapping({"/GetAllAccound"})
	public void doit2(HttpServletResponse response, HttpServletRequest request)throws Exception{
		super.setReqAndRes(request, response);
		String token = request.getParameter("token");
		String reString = service.allUser(token);
		PrintWriter pw = this.response.getWriter();
		System.out.println(pw);
		pw.println(reString);
		pw.flush();
		pw.close();
	}
	@RequestMapping({"/register"})
	public void register(HttpServletResponse response, HttpServletRequest request) throws Exception{
		//super.setReqAndRes(request, response);
		 if (this.request.getMethod().equals("OPTIONS")) {
			 PrintWriter pw = this.response.getWriter();
				//System.out.println(pw);
				pw.println("");
				pw.flush();
				pw.close();
		 
		 }else {
		String userid = request.getParameter("userid");
		String userpw = request.getParameter("psw");
		String nick = request.getParameter("nick");
		String position = request.getParameter("position");
		String phone = request.getParameter("phone");
		String roles = request.getParameter("roleArr");
		
		User user = new User();
		user.setUserid(userid);
		user.setRoles(roles);
		user.setId(Encipher.generaterPrimaryKey());
		user.setPassword(Encipher.md5(userpw));//MD5加密
		user.setNick(nick);
		user.setPosition(position);
		user.setPhone(phone);
		String rig = service.addUser(user);
		PrintWriter pw = this.response.getWriter();
		System.out.println(pw);
		pw.println(rig);
		pw.flush();
		pw.close();
		 }
	}
	
	@RequestMapping({"/updateAccound"})
	public void doit4(HttpServletResponse response, HttpServletRequest request)throws Exception {
		 if (this.request.getMethod().equals("OPTIONS")) {
			 PrintWriter pw = this.response.getWriter();
				//System.out.println(pw);
				pw.println("");
				pw.flush();
				pw.close();
		 
		 }else {
			 String id = request.getParameter("id");
			 String nick = request.getParameter("nick");
			 String position = request.getParameter("position");
			 String phone = request.getParameter("phone");
			 User user2 = new User();
			 user2.setId(id);
			 user2.setNick(nick);
			 user2.setPosition(position);
			 user2.setPhone(phone);
			 String rig = service.updateUser(user2);
				PrintWriter pw = this.response.getWriter();
				System.out.println(pw);
				pw.println(rig);
				pw.flush();
				pw.close();
		 }
	}
	@RequestMapping({"/delAccound"})
	public void doit5(HttpServletResponse response, HttpServletRequest request)throws Exception {
		 if (this.request.getMethod().equals("OPTIONS")) {
			 PrintWriter pw = this.response.getWriter();
				//System.out.println(pw);
				pw.println("");
				pw.flush();
				pw.close();
		 
		 }else {
			 String user = request.getParameter("id");
			 User user2 = new User();
			 user2.setId(user);
			 String rig = service.delUser(user2);
				PrintWriter pw = this.response.getWriter();
				System.out.println(pw);
				pw.println(rig);
				pw.flush();
				pw.close();
		 }
	}
	
	
	@RequestMapping({"/logout"})
	public void doit3(HttpServletResponse response, HttpServletRequest request) throws Exception{
		super.setReqAndRes(request, response);
		String token = request.getParameter("token");
		String reString = service.logout(token);
		PrintWriter pw = this.response.getWriter();
		System.out.println(pw);
		pw.println(reString);
		pw.flush();
		pw.close();
	}
}
