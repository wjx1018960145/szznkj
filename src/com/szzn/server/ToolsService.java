package com.szzn.server;

import javax.servlet.http.HttpServletRequest;

public abstract interface ToolsService {
	public abstract String selectAllInterface(String token)throws Exception;
	public abstract String addInterface(HttpServletRequest request)throws Exception;
	public abstract String updateInterface(HttpServletRequest request)throws Exception;
	public abstract String delInterface(HttpServletRequest request)throws Exception;
	public abstract String creatInterface(HttpServletRequest request)throws Exception;
}