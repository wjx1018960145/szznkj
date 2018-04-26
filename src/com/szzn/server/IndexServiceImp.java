package com.szzn.server;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.szzn.dao.MenusDao;
@Service
public class IndexServiceImp implements IndexService {
	@Resource
	private MenusDao dao;
	@Override
	public String menus() throws Exception {
		// TODO Auto-generated method stub
		return dao.select();
	}

}
