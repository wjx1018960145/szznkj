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
import com.szzn.mode.Project;
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
	/**
	 * 添加一个项目
	 * @param project
	 * @return
	 * @throws Exception
	 */
	public boolean commitpro(Project project)throws Exception{
		String pro=  (String) getSqlMapClientTemplate().insert("commitProject",project);
		return pro != null ? true : false;
	}
	/**
	 * 查询某个项目信息
	 * @param name
	 * @return
	 * @throws Exception
	 */
	public Project selectProjectWithProjectName(String name)throws Exception {
		return (Project)getSqlMapClientTemplate().queryForObject("selectProject",name);
	}
	/**
	 * 
	 * @param token
	 * @return
	 * @throws Exception
	 */
	
	@SuppressWarnings({ "unused", "unchecked" })
	public String queryProject(String token)throws Exception {
		Map<String, Object> result = new HashMap<String, Object>();
		List<Map> resultlist = new ArrayList<Map>();
		List<Project> list = getSqlMapClientTemplate().queryForList("selProject"); 
		if (list.size()>0) {
		for (Project project : list) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("uid", project.getUid());
			map.put("id", project.getId());
			map.put("name", project.getProname());
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 设置日期格式
			map.put("ctime",project.getProtime());
			map.put("des", project.getProdes());
			resultlist.add(map);
		}
		result.put("code", Integer.valueOf("20000"));
		result.put("msg", "获取成功");
		result.put("body", resultlist);
		}else {
			result.put("code", Integer.valueOf("30000"));
			result.put("msg", "数据为空或者查询失败");
			result.put("body", resultlist);
		}
		String string = JSONObject.fromObject(result).toString();
		return string;
	} 
	
	@SuppressWarnings({ "unused", "unchecked", "rawtypes" })
	public String queryAllProNameWithToken(String token) throws Exception {
		Map<String, Object> result = new HashMap<String, Object>();
		List<Map> resultlist = new ArrayList<Map>();
		List<Project> list = getSqlMapClientTemplate().queryForList("selectProject",token);
		if (list.size()>0) {
			for (Project project : list) {
				Map<String, String> map = new HashMap<>();
				map.put("id", project.getId());
				map.put("name", project.getProname());
				resultlist.add(map);
			}
			result.put("code", Integer.valueOf("20000"));
			result.put("msg", "查询成功!");
			result.put("body", resultlist);
		}else {
			result.put("code", Integer.valueOf("30000"));
			result.put("msg", "项目为空请先添加项目!");
			result.put("body", resultlist);
		}
		return JSONObject.fromObject(result).toString();
	}
	
	
}
