package com.szzn.server;

import javax.servlet.http.HttpServletRequest;

public abstract interface ChartsService {
	
	public abstract String getDayActive(HttpServletRequest request)throws Exception;
	public abstract String getDayGrowth(HttpServletRequest request)throws Exception;
//	public abstract String getCity(HttpServletRequest request)throws Exception;
//	public abstract String getCity(HttpServletRequest request)throws Exception;
//	public abstract String getCity(HttpServletRequest request)throws Exception;

}
