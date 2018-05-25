package com.szzn.server;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import com.szzn.dao.UtilsDao;
import com.szzn.mode.CityPosition;
import com.szzn.utils.Encipher;
@Service
public class UtilsServiceImp implements UtilsService {

	@Resource
	UtilsDao dao;
	@Override
	public String queryAllCityPosition() throws Exception {
		// TODO Auto-generated method stub
		return dao.queryAll();
	}
	@Override
	public String addCity(HttpServletRequest request) throws Exception {
		CityPosition cityPosition = new CityPosition();
		cityPosition.setCityid(request.getParameter("id"));
		cityPosition.setUid(Encipher.generaterPrimaryKey());
		cityPosition.setCityname(request.getParameter("cityname"));
		cityPosition.setDimension(request.getParameter("dimension"));
		cityPosition.setLongitude(request.getParameter("longitude"));
		return dao.addCity(cityPosition);
	}
	@Override
	public String editCity(HttpServletRequest request) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String deleCity(HttpServletRequest request) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String updateState(HttpServletRequest request) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
