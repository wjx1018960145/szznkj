package com.szzn.action;

import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.szzn.server.RolePermissionService;
import com.szzn.server.RolePermissionServiceImpl;



@Controller
@RequestMapping({"/rolepermission"})
public class RolePermission extends BaseController {
		@Resource
		private RolePermissionService service;
	public RolePermission(){
			this.service = new RolePermissionServiceImpl();
			
		}
	@RequestMapping({"getlistRole"})
	public void queryRole(HttpServletResponse response, HttpServletRequest request) throws Exception{
		super.setReqAndRes(request, response);
		//String type = request.getParameter("type");
		String list = service.queryAllForRole(1);
		
		PrintWriter pw = this.response.getWriter();
		System.out.println(pw);
		pw.println(list);
		pw.flush();
		pw.close();
	}
	@RequestMapping({"getlistPermission"})
	public void getlistPermission(HttpServletResponse response, HttpServletRequest request) throws Exception{
		super.setReqAndRes(request, response);
		String list = service.queryAllForPermission(1);
		PrintWriter pw = this.response.getWriter();
		System.out.println(pw);
		pw.println(list);
		pw.flush();
		pw.close();
	}
	
	
	@RequestMapping({"addRole"})
	public void addRole(HttpServletResponse response, HttpServletRequest request) throws Exception{
		//super.setReqAndRes(request, response);
		/*String trString = request.getParameter("id");
		System.out.println(trString);*/
		System.out.println(request.getCharacterEncoding());
			if (request.getMethod().equals("OPTIONS")) {
			PrintWriter pw = this.response.getWriter();
			System.out.println(pw);
			pw.println("");
			pw.flush();
			pw.close();
		}else {
			boolean isadd = service.addRole(request);
			Map<String, Object> map = new HashMap<String, Object>();
			if (isadd) {
				map.put("code", Integer.valueOf("20000"));
				map.put("msg", "添加成功");
			}else {
				map.put("code", "111111");
				map.put("msg", "添加失败或者角色id重复");
			}
			PrintWriter pw = this.response.getWriter();
			System.out.println(pw);
			pw.println(JSONObject.fromObject(map).toString());
			pw.flush();
			pw.close();
		}
		
	}
	@RequestMapping({"deleteRole"})
	public void deleteRole(HttpServletResponse response, HttpServletRequest request) throws Exception{
		//super.setReqAndRes(request, response);
	if (request.getMethod().equals("OPTIONS")) {
			
			
			PrintWriter pw = this.response.getWriter();
			System.out.println(pw);
			pw.println("");
			pw.flush();
			pw.close();
		}else {
			String resource = service.deleteRole(request);
			PrintWriter pw = this.response.getWriter();
			System.out.println(pw);
			pw.println(resource);
			pw.flush();
			pw.close();
		}
		/*String trString = request.getParameter("id");
		System.out.println(trString);*/
		
	}
	@RequestMapping({"changRole"})
	public void changRole(HttpServletResponse response, HttpServletRequest request) throws Exception{
		//super.setReqAndRes(request, response);
		 if (this.request.getMethod().equals("OPTIONS")) {
			 PrintWriter pw = this.response.getWriter();
				//System.out.println(pw);
				pw.println("");
				pw.flush();
				pw.close();
		 
		 }else {
			 String isadd  = service.changRole(request);
				PrintWriter pw = this.response.getWriter();
				System.out.println(pw);
				pw.println(isadd);
				pw.flush();
				pw.close();
		 }
		
	}
	
	@RequestMapping({"addPermission"})
	public void addPermission(HttpServletResponse response, HttpServletRequest request) throws Exception{
		super.setReqAndRes(request, response);
		/*String trString = request.getParameter("id");
		System.out.println(trString);*/
		 if (this.request.getMethod().equals("OPTIONS")) {
			 PrintWriter pw = this.response.getWriter();
				//System.out.println(pw);
				pw.println("");
				pw.flush();
				pw.close();
		 
		 }else {
			 boolean isadd = service.addPermission(request);
			Map<String, Object> map = new HashMap<String, Object>();
			if (isadd) {
				map.put("code", Integer.valueOf("20000"));
				map.put("msg", "添加成功");
			}else {
				map.put("code", Integer.valueOf("20001"));
				map.put("msg", "添加失败或者权限id重复");
			}
			PrintWriter pw = this.response.getWriter();
			System.out.println(pw);
			pw.println(JSONObject.fromObject(map).toString());
			pw.flush();
			pw.close();
			}
		
	}
	
	@RequestMapping({"deletePermission"})
	public void deletePermission(HttpServletResponse response, HttpServletRequest request) throws Exception{
		//super.setReqAndRes(request, response);
		/*String trString = request.getParameter("id");
		System.out.println(trString);*/
		 if (this.request.getMethod().equals("OPTIONS")) {
			 PrintWriter pw = this.response.getWriter();
				//System.out.println(pw);
				pw.println("");
				pw.flush();
				pw.close();
		 
		 }else {
			 String resource = service.deletePermission(request);
				PrintWriter pw = this.response.getWriter();
				System.out.println(pw);
				pw.println(resource);
				pw.flush();
				pw.close();
		 }
		
	}
	@RequestMapping({"changPermission"})
	public void changPermission(HttpServletResponse response, HttpServletRequest request) throws Exception{
		super.setReqAndRes(request, response);
		/*String trString = request.getParameter("id");
		System.out.println(trString);*/
		String isadd  = service.changPermission(request);
		PrintWriter pw = this.response.getWriter();
		System.out.println(pw);
		pw.println(isadd);
		pw.flush();
		pw.close();
	}
	
	@RequestMapping({"selectStartRole.do"})
	public void selectStartRole(HttpServletResponse response, HttpServletRequest request)throws Exception{
		String string =	service.queryallStartRole(request);
		PrintWriter pw = this.response.getWriter();
		System.out.println(pw);
		pw.println(string);
		pw.flush();
		pw.close();
	}
	
	
	@RequestMapping({"selectPermissionForRole.do"})
	public void selectPermissionForRole(HttpServletResponse response, HttpServletRequest request) throws Exception {
	String string =	service.queryPermissionForRole(request);
	PrintWriter pw = this.response.getWriter();
	System.out.println(pw);
	pw.println(string);
	pw.flush();
	pw.close();
	
	}
	
	@RequestMapping({"addPermissionForRole.do"})
	public void addPermissionForRole(HttpServletResponse response, HttpServletRequest request) throws Exception {
		String string =	service.addPermissionForRole(request);
		PrintWriter pw = this.response.getWriter();
		System.out.println(pw);
		pw.println(string);
		pw.flush();
		pw.close();
	}
	@RequestMapping({"deletePermissionForRole.do"})
	public void deletePermissionForRole(HttpServletResponse response, HttpServletRequest request) throws Exception {
		String string =	service.deletePermissionForRole(request);
		PrintWriter pw = this.response.getWriter();
		System.out.println(pw);
		pw.println(string);
		pw.flush();
		pw.close();
	}
	@RequestMapping({"selectRoleForU.do"})
	public void selectRoleForU(HttpServletResponse response, HttpServletRequest request) throws Exception{
		String string =	service.queryRoleForU(request);
		PrintWriter pw = this.response.getWriter();
		System.out.println(pw);
		pw.println(string);
		pw.flush();
		pw.close();
	}
	@RequestMapping({"addRoleForU.do"})
	public void addRoleForU(HttpServletResponse response, HttpServletRequest request) throws Exception {
		
	}
	@RequestMapping({"deletRoleForU.do"})
	public void deletRoleForU(HttpServletResponse response, HttpServletRequest request) throws Exception {
		
	}
	
	
}
