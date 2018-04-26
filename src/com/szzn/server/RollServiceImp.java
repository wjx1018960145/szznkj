package com.szzn.server;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONObject;

import org.springframework.stereotype.Service;

import com.szzn.dao.RollDao;
import com.szzn.mode.RollList;
@Service
public class RollServiceImp implements RollService {

	@Resource
	private RollDao dao;
	public void add(RollList list) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String queryAll() throws Exception {
		// TODO Auto-generated method stub
		return dao.selectLinksAll();
	}

	@Override
	public String findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String add(HttpServletRequest request) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String update(HttpServletRequest request) throws Exception {
		// TODO Auto-generated method stub
		
		
		
		return dao.update(param);
	}

	@Override
	public String delete(HttpServletRequest request) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		String id = request.getParameter("rollid");
		if (dao.delete(id)) {
			map.put("code", "000000");
			map.put("msg", "删除成功!");
		}else {
			map.put("code", "300000");
			map.put("msg", "删除失败!");
			
		}
		String jsonString = JSONObject.fromObject(map).toString();
		
		return jsonString;
	}

}
