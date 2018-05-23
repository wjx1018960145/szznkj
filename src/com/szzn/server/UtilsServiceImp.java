package com.szzn.server;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.szzn.dao.UtilsDao;
@Service
public class UtilsServiceImp implements UtilsService {

	@Resource
	UtilsDao dao;
	@Override
	public String queryAllCityPosition() throws Exception {
		// TODO Auto-generated method stub
		return dao.queryAll();
	}

}
