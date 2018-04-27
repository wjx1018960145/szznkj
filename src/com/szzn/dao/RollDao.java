package com.szzn.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

import org.springframework.stereotype.Component;

import com.szzn.mode.RollList;



@Component
public class RollDao extends BaseDao {
	
	/**
	 * 查询出所有链接 不组装
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public String selectLinksAll() throws Exception {
		List<RollList> list = getSqlMapClientTemplate().queryForList("selectAllRoll");
		Map<String, Object> result = new HashMap<String, Object>();
		List<Map> resultlist = new ArrayList<Map>();
		if (list.size()>0) {
		for (RollList link : list) {
			
			Map<String, String> map = new HashMap<String, String>();
			map.put("rollid", link.getId());
			map.put("rolltitle", link.getTitle());
			map.put("rolldes", link.getDes());
			map.put("rolllink", link.getLink());
			map.put("rolltype", link.getType());
			map.put("uid", link.getKey());
			resultlist.add(map);
			
		}
		result.put("code", Integer.valueOf("20000"));
		result.put("msg", "获取成功");
		result.put("body", resultlist);
		}else {
			result.put("code", Integer.valueOf("30000"));
			result.put("msg", "获取成功,数据为空!");
		}
		String string = JSONObject.fromObject(result).toString();
		return string;
	}
	
	/**
	 * 根据连接到id查询出详细信息
	 * @param linkid
	 * @return
	 * @throws Exception
	 */
	public  RollList selectByLinkId(String linkid) throws Exception{
		//return (RollList)getSqlMapClientTemplate().queryForObject("selectByLinkId",linkid);
	return null;
	}
	/**
	 *  添加一个链接
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public  boolean commit(RollList param) throws Exception{
		//RollList link =  (RollList) getSqlMapClientTemplate().insert("commit",param);
		return true;
	}
	/**
	 * 更新一个链接
	 * @param param
	 * @return
	 * @throws Exception
	 */
	
	public  boolean update(RollList param) throws Exception{
		//int res =  getSqlMapClientTemplate().update("updateLink", param);
		return true;
		
	}
	/**
	 * 删除一个链接
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public  boolean delete(String id) throws Exception{
		//int res = getSqlMapClientTemplate().delete("deleteRoll", id);
		return true;
	}
}
