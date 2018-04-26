package com.szzn.server;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import com.szzn.mode.Permission;
import com.szzn.mode.Role;


public interface RolePermissionService {
	//角色服务
	public abstract String queryAllForRole(int type)throws Exception;
	public abstract Role queryByRoleId(int id) throws Exception;
	public abstract boolean addRole(HttpServletRequest request) throws Exception;
	public abstract String deleteRole(HttpServletRequest request) throws Exception;
	public abstract String changRole(HttpServletRequest request) throws Exception;
	
	
	
	//权限服务
	public abstract Permission queryByPermissionId(int id) throws Exception;
	public abstract String queryAllForPermission(int type)throws Exception;
	public abstract boolean addPermission(HttpServletRequest request) throws Exception;
	//public abstract boolean update(Role param) throws Exception;
	public abstract String deletePermission(HttpServletRequest request) throws Exception;
	public abstract String changPermission(HttpServletRequest request) throws Exception;
	
	
	/**
	 * 给角色添加权限
	 * 给用户添加角色
	 * 
	 */
	public abstract String queryallStartRole(HttpServletRequest request) throws Exception;
	public abstract String queryPermissionForRole(HttpServletRequest request) throws Exception;
	public abstract String addPermissionForRole(HttpServletRequest request) throws Exception;
	public abstract String deletePermissionForRole(HttpServletRequest request) throws Exception;
	
	public abstract String queryRoleForU(HttpServletRequest request) throws Exception;
	public abstract String addRoleForU(HttpServletRequest request) throws Exception;
	public abstract String deleteRoleForU(HttpServletRequest request) throws Exception;
	
	
}
