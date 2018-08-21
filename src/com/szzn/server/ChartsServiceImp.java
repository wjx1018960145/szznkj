package com.szzn.server;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import com.szzn.dao.ChartsDao;
import org.springframework.stereotype.Service;
@Service
public class ChartsServiceImp implements ChartsService {

	@Resource
	private ChartsDao dao;
	
	@Override
	public String getDayActive(HttpServletRequest request) throws Exception {
		// TODO Auto-generated method stub
		return dao.selectDayActive();
	}

	@Override
	public String getDayGrowth(HttpServletRequest request) throws Exception {
		// TODO Auto-generated method stub
		return dao.selectDayGrowth();
	}

}
