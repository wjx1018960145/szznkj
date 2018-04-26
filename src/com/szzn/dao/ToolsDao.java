package com.szzn.dao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;


import net.sf.json.JSONObject;

import org.springframework.stereotype.Component;



import com.szzn.mode.Interface;
import com.szzn.utils.Encipher;


@Component
public class ToolsDao extends BaseDao {
	
	
	@SuppressWarnings({ "unused", "unchecked" })
	public String queryInterface(String token)throws Exception {
		Map<String, Object> result = new HashMap<String, Object>();
		List<Map> resultlist = new ArrayList<Map>();
		List<Interface> list = getSqlMapClientTemplate().queryForList("selInterface"); 
		if (list.size()>0) {
		for (Interface interface1 : list) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("uid", interface1.getUid());
			map.put("id", interface1.getId());
			map.put("name", interface1.getName());
			map.put("author", interface1.getAuthor());
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 设置日期格式
			map.put("ctime",interface1.getCtime());
			map.put("project", interface1.getPrject());
			map.put("interfaces", interface1.getInterfaces());
			map.put("des", interface1.getDes());
			map.put("rank", interface1.getRank());
			map.put("path", interface1.getPath());
			resultlist.add(map);
		}
		result.put("code", Integer.valueOf("20000"));
		result.put("msg", "获取成功");
		result.put("body", resultlist);
		}else {
			result.put("code", Integer.valueOf("30000"));
			result.put("msg", "获取成功");
			result.put("body", resultlist);
		}
		String string = JSONObject.fromObject(result).toString();
		return string;
	}
	/**
	 * 添加接口
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public  boolean commit(Interface param) throws Exception{
		String product =  (String) getSqlMapClientTemplate().insert("commitInterface",param);
		return product != null ? true : false;
	}
	/***
	 * 查询某个接口
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public  Interface selectByInterfacetId(String name) throws Exception{
		return (Interface)getSqlMapClientTemplate().queryForObject("selectInterface",name);
	}
	/**
	 * 修改接口
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public  boolean updateByInterfacetName(Interface param) throws Exception{
		int res =  getSqlMapClientTemplate().update("updateinterface", param);
		return res > 0 ? true : false;
	}
	/**
	 * 删除一个接口
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public  boolean deleteByInterfacetName(Interface param) throws Exception{
		int res =  getSqlMapClientTemplate().update("deleteinterface", param);
		return res > 0 ? true : false;
	}
	
	public String creatinterface(String id)throws Exception {
		Map<String, Object> result = new HashMap<String, Object>();
		Interface interface1 =	(Interface)getSqlMapClientTemplate().queryForObject("selectInterface",id);
		if (interface1==null) {
			result.put("code", Integer.valueOf("30000"));
			result.put("msg", "接口不存在");
		}else {
			result.put("code", Integer.valueOf("20000"));
			result.put("interface", interface1.getInterfaces());
		}
		
		String string = JSONObject.fromObject(result).toString();
		return string;
	}
	
}