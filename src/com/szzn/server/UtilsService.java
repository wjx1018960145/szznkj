package com.szzn.server;

import javax.servlet.http.HttpServletRequest;

public abstract interface UtilsService {
	public abstract String queryAllCityPosition()throws Exception;
	public abstract String addCity(HttpServletRequest request)throws Exception;
	public abstract String editCity(HttpServletRequest request)throws Exception;
	public abstract String deleCity(HttpServletRequest request)throws Exception;
	public abstract String updateState(HttpServletRequest request)throws Exception;
}
