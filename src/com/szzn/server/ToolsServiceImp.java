package com.szzn.server;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONObject;

import org.springframework.stereotype.Service;

import com.szzn.dao.ToolsDao;
import com.szzn.mode.Interface;
import com.szzn.utils.Encipher;

@Service
public class ToolsServiceImp implements ToolsService {

	@Resource
	ToolsDao dao;
	@Override
	public String selectAllInterface(String token) throws Exception {
		// TODO Auto-generated method stub
		return dao.queryInterface(token);
	}
	@Override
	public String addInterface(HttpServletRequest request) throws Exception {
		// TODO Auto-generated method stub
		Map<String, Object> map = new HashMap<String, Object>();
		String nameString = new String(request.getParameter("name").getBytes("iso-8859-1"),"utf-8");
		Interface interface1 = new Interface();
		interface1.setUid(Encipher.generaterPrimaryKey());
		interface1.setId(request.getParameter("id"));
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 设置日期格式
		interface1.setCtime(df.format(new Date()));
		interface1.setName(nameString);
		String valueString = new String(request.getParameter("values").getBytes("iso-8859-1"),"utf-8");
		interface1.setInterfaces(valueString);
		interface1.setPrject(request.getParameter("project"));
		interface1.setPath(Encipher.getIpAndPort()+"/szznkj/tools/creatInterface?name="+nameString);
		Interface interface2 = dao.selectByInterfacetId(nameString);
		if (interface2!=null) {
			map.put("code", Integer.valueOf("30000"));
			map.put("msg", "接口已存在");
		}else {
			if (dao.commit(interface1)) {
				map.put("code", Integer.valueOf("20000"));
				map.put("msg", "添加成功");
			}
		}
		return JSONObject.fromObject(map).toString();
	}
	@Override
	public String updateInterface(HttpServletRequest request) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		String nameString = new String(request.getParameter("name").getBytes("iso-8859-1"),"utf-8");
		Interface interface1 = new Interface();
		interface1.setUid(Encipher.generaterPrimaryKey());
		interface1.setId(request.getParameter("id"));
		interface1.setRank(request.getParameter("rank"));
		interface1.setPrject(request.getParameter("project"));
		interface1.setDes(new String(request.getParameter("des").getBytes("iso-8859-1"),"utf-8"));
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 设置日期格式
		interface1.setCtime(df.format(new Date()));
		interface1.setInterfaces(new String(request.getParameter("values").getBytes("iso-8859-1"),"utf-8"));
		
		if (dao.updateByInterfacetName(interface1)) {
			map.put("code", Integer.valueOf("20000"));
			map.put("msg", "修改成功");
		}else {
			map.put("code", Integer.valueOf("30000"));
			map.put("msg", "修改失败");
		}
		
		return JSONObject.fromObject(map).toString();
	}
	@Override
	public String delInterface(HttpServletRequest request) throws Exception {
		String nameString = new String(request.getParameter("name").getBytes("iso-8859-1"),"utf-8");
		Map<String, Object> map = new HashMap<String, Object>();
		Interface interface1 = new Interface();
		interface1.setName(nameString);
		if (dao.deleteByInterfacetName(interface1)) {
			map.put("code", Integer.valueOf("20000"));
			map.put("msg", "删除成功");
		}else {
			map.put("code", Integer.valueOf("30000"));
			map.put("msg", "删除失败");
		}
		
		return JSONObject.fromObject(map).toString();
	}
	@Override
	public String creatInterface(HttpServletRequest request) throws Exception {
		String nameString = new String(request.getParameter("name").getBytes("iso-8859-1"),"utf-8");
		Map<String, Object> map = new HashMap<String, Object>();
		if (!nameString.equals("")) {
			if (dao.creatinterface(nameString)!=null) {
				return dao.creatinterface(nameString);
			}else {
				map.put("code", Integer.valueOf("30000"));
				map.put("msg", "创建失败");
			}
			
		}else {
			map.put("code", Integer.valueOf("30000"));
			map.put("msg", "接口名称不能为空");
		}
		
		return JSONObject.fromObject(map).toString();
	}
	

}
