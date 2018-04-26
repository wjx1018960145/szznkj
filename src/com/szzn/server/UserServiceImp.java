package com.szzn.server;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import net.sf.json.JSONObject;

import org.springframework.stereotype.Service;


import com.szzn.dao.UserDao;
import com.szzn.mode.User;
@Service
public class UserServiceImp implements UserService {
	
	@Resource
	private UserDao dao;
	@Override
	public String login(User user) throws Exception {
		return dao.login(user);
	}
	@Override
	public String info(String token) throws Exception {
		
		
		return dao.infoUser(token);
	}
	@Override
	public String logout(String token) throws Exception {
		// TODO Auto-generated method stub
		return dao.userOut(token);
	}
	@Override
	public String allUser(String token) throws Exception {
		// TODO Auto-generated method stub
		return dao.queryAlluser(token);
	}
	@Override
	public String updateUser(User user) throws Exception {
		// TODO Auto-generated method stub
		Map<String, Object> map = new HashMap<String, Object>();
		if (dao.updateUser(user)) {
			map.put("code", Integer.valueOf("20000"));
			map.put("msg", "删除成功");
		}else {
			map.put("code", Integer.valueOf("30000"));
			map.put("msg", "删除失败");
		}
		return JSONObject.fromObject(map).toString();
	}
	@Override
	public String addUser(User user) throws Exception {
		// TODO Auto-generated method stub
		return dao.register(user);
	}
	@Override
	public String delUser(User user) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		if (dao.deleteUser(user)) {
			map.put("code", Integer.valueOf("20000"));
			map.put("msg", "删除成功");
		}else {
			map.put("code", Integer.valueOf("30000"));
			map.put("msg", "删除失败");
		}
		return JSONObject.fromObject(map).toString();
	}

}
