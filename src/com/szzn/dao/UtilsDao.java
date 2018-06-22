package com.szzn.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

import org.springframework.stereotype.Component;

import com.szzn.mode.CityPosition;
import com.szzn.mode.User;

@Component
public class UtilsDao extends BaseDao {
	
	/**
	 * 查询多有城市
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unused")
	public String queryAll()throws Exception {
		@SuppressWarnings("unchecked")
		List<CityPosition> list = getSqlMapClientTemplate().queryForList("selCity");
		Map<String, Object> result = new HashMap<String, Object>();
		@SuppressWarnings("rawtypes")
		List<Map> resultlist = new ArrayList<Map>();
		if (list.size() > 0) {
			for (CityPosition cityPosition : list) {
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("uid", cityPosition.getUid());
				map.put("cityname", cityPosition.getCityname());
				map.put("cityid", cityPosition.getCityid());
				map.put("longitude", cityPosition.getLongitude());
				map.put("dimension", cityPosition.getDimension());
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
	
	public String addCity(CityPosition cityPosition)throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		User user = (User) getSqlMapClientTemplate().insert("commitCity",
				cityPosition);
		if (user != null) {
			map.put("code", "000000");
			map.put("msg", "注册成功");
			map.put("body", user);
		} else {
			map.put("code", "111111");
			map.put("msg", "注册失败");
		}
		String string = JSONObject.fromObject(map).toString();
		return string;
		
	}
	
	public CityPosition queryCityWithcityid (String cityid) throws Exception {
		CityPosition cityPosition = (CityPosition) getSqlMapClientTemplate().queryForObject(
				"selectCity", cityid);
		return cityPosition;
	}
	
	
}
