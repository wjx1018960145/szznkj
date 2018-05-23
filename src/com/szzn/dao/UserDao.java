package com.szzn.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import com.szzn.mode.User;

@Component
public class UserDao extends BaseDao {
	/**
	 * 后管登陆
	 * 
	 * @param param
	 *            传入用户实体
	 * @return
	 */
	public String login(User param) throws Exception{
		Map<String, Object> map = new HashMap<String, Object>();
		User user = (User) getSqlMapClientTemplate().queryForObject("login",
				param);
		if (user != null) {
			
			if (updateGeographicPosition(param.getLongitude(),param.getDimension(),param.getUserid())) {
				map.put("code", Integer.valueOf("20000"));
				map.put("token", user.getUserid());
				map.put("msg", "登陆成功");
				map.put("body", user);
			}else {
				map.put("code", Integer.valueOf("20000"));
				map.put("token", user.getUserid());
				map.put("msg", "地理位置获取失败");
				map.put("body", user);
			}
			
		} else {
			map.put("code", "11111");
			map.put("msg", "登陆失败");
		}
		String string = JSONObject.fromObject(map).toString();
		return string;
	}

	@SuppressWarnings({ "unused", "rawtypes", "unchecked" })
	public String infoUser(String token) {
		List<User> queryForList = null;
		Map<String, Object> map = new HashMap<String, Object>();
		List<Map> resultlist = new ArrayList<Map>();
		List<String> list = new ArrayList<>();
		//list.add("admin");
		Map<String, Object> result = new HashMap<String, Object>();
		User user = (User) getSqlMapClientTemplate().queryForObject(
				"selectByUserId", token);
		if (user != null) {
			String roleString = user.getRoles();
			JSONArray json = JSONArray.fromObject(roleString);//userStr是json字符串
			List users= (List)JSONArray.toCollection(json);
			
			for (Object object : users) {
				if (object.equals("r10")) {
					list.add("admin");
				}else {
					list.add("edit");
				}
			}
			
			map.put("id", user.getId());
			map.put("userid", user.getUserid());
			map.put("nick", user.getNick());
			map.put("role", list);
			map.put("roles", list);
			map.put("headImg", user.getHeadImg());
			map.put("position", user.getPosition());
			resultlist.add(map);
			result.put("code", Integer.valueOf("20000"));
			result.put("msg", "获取成功");
			result.put("body", resultlist);
		} else {
			result.put("code", "00000");
			result.put("msg", "获取失败");
			result.put("body", resultlist);
		}
		String string = JSONObject.fromObject(result).toString();
		return string;
	}
	
	public User queryUser(String id)throws Exception {
		User user = (User) getSqlMapClientTemplate().queryForObject(
				"selectByUserId", id);
		return user;
	}

	public String userOut(String userid) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		if (this.installLog(1, userid)) {
			map.put("code", Integer.valueOf("20000"));
			map.put("msg", "获取成功");
			map.put("body", "");
		} else {
			map.put("code", Integer.valueOf("00000"));
			map.put("msg", "获取成功");
			map.put("body", "");
		}
		String string = JSONObject.fromObject(map).toString();
		return string;
	}

	public String queryAlluser(String token) throws Exception {
		@SuppressWarnings("unchecked")
		List<User> list = getSqlMapClientTemplate().queryForList("selectAllU");
		Map<String, Object> result = new HashMap<String, Object>();
		@SuppressWarnings("rawtypes")
		List<Map> resultlist = new ArrayList<Map>();
		if (list.size() > 0) {
			for (User user : list) {
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("id", user.getId());
				map.put("userid", user.getUserid());
				map.put("nick", user.getNick());
				map.put("role", "");
				map.put("roles", "");
				map.put("headImg", user.getHeadImg());
				map.put("nick", user.getNick());
				map.put("phone", user.getPhone());
				map.put("position", user.getPosition());
				resultlist.add(map);
			}
			result.put("code", Integer.valueOf("20000"));
			result.put("msg", "获取成功");
			result.put("body", resultlist);
		} else {
			result.put("code", "111111");
			result.put("msg", "获取成功,数据为空");
		}
		String string = JSONObject.fromObject(result).toString();
		return string;
	}

	public String register(User param) {
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			User user = (User) getSqlMapClientTemplate().insert("commitU",
					param);
			if (user != null) {
				map.put("code", "000000");
				map.put("msg", "注册成功");
				map.put("body", user);
			} else {
				map.put("code", "111111");
				map.put("msg", "注册失败");
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		String string = JSONObject.fromObject(map).toString();
		return string;
	}
	
	public boolean deleteUser(User user)throws Exception {
		int res = getSqlMapClientTemplate().delete("deleteUser", user);
		return res > 0 ? true : false;
	}
	public boolean updateUser(User user)throws Exception {
		int res = getSqlMapClientTemplate().delete("updateUser", user);
		return res > 0 ? true : false;
	}
	
	@SuppressWarnings("unused")
	private boolean updateGeographicPosition(String longitude,String dimension,String userid)throws Exception {
		User user = new  User();
		user.setLongitude(longitude);
		user.setDimension(dimension);
		user.setUserid(userid);
		int res = getSqlMapClientTemplate().delete("updateGeographicPosition", user);
		return res > 0 ? true : false;
	}

}
