package com.szzn.dao;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Component;
import com.szzn.mode.Menus;

@Component
public class MenusDao extends BaseDao {
	@SuppressWarnings({ "unused" })
	public String select()throws Exception{
		@SuppressWarnings("unchecked")
		List<Menus> list = getSqlMapClientTemplate().queryForList("menus");
		Map<String, Object> result = new HashMap<String, Object>();
		Map<String, Object> bgdicMap = new HashMap<String, Object>();
		List<Map> resultlist = new ArrayList<Map>();
		if (list.size()>0) {
			for (Menus menu : list) {
				Map<String, String> map = new HashMap<String, String>();
				map.put("id", menu.getId());
				map.put("name", menu.getName());
				map.put("selected", menu.getSelected());
				resultlist.add(map);
			}
			result.put("code", "000000");
			result.put("msg", "获取成功");
			result.put("body", resultlist);
		}else {
			result.put("code", "111111");
			result.put("msg", "获取成功,数据为空");
		}
		String string = JSONObject.fromObject(result).toString();
		return string;
	}
}
