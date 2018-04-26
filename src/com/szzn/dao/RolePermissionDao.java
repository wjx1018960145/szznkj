package com.szzn.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

import org.springframework.orm.ibatis.SqlMapClientCallback;
import org.springframework.stereotype.Component;

import com.szzn.mode.Permission;

import com.szzn.mode.Role;
import com.szzn.mode.RolePermission;
import com.szzn.mode.User;
import com.szzn.mode.UserRole;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapExecutor;
import com.szzn.mode.Permission;

@Component
public class RolePermissionDao extends BaseDao {
	/**
	 * 查询所有的角色
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public  String selectAll()throws Exception{
		List<Role> list = getSqlMapClientTemplate().queryForList("selectAllR");
		Map<String, Object> result = new HashMap<String, Object>();
		List<Map> resultlist = new ArrayList<Map>();
		if (list.size()>0) {
			for (Role role : list) {
					Map<String, String> map = new HashMap<String, String>();
					map.put("id", role.getId());
					map.put("name", role.getName());
					map.put("description", role.getDescription());
					map.put("uid", role.getUid());
					map.put("isUse", role.getIsUse());
					resultlist.add(map);
			}
			result.put("code", Integer.valueOf("20000"));
			result.put("msg", "获取成功");
			result.put("body", resultlist);
		}else {
			result.put("code", "111111");
			result.put("msg", "获取成功,数据为空");
		}
		String string = JSONObject.fromObject(result).toString();
		return string;
	}
	
	/**
	 * 查询所有的权限
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public  String selectAllforPermission()throws Exception{
		List<Permission> list = getSqlMapClientTemplate().queryForList("selectAllPermission");
		Map<String, Object> result = new HashMap<String, Object>();
		List<Map> resultlist = new ArrayList<Map>();
		if (list.size()>0) {
			for (Permission role : list) {
					Map<String, String> map = new HashMap<String, String>();
					map.put("id", role.getId());
					map.put("name", role.getName());
					map.put("description", role.getDescription());
					map.put("uid", role.getUid());
					map.put("isUse", role.getIsUse());
					resultlist.add(map);
			}
			result.put("code", Integer.valueOf("20000"));
			result.put("msg", "获取成功");
			result.put("body", resultlist);
		}else {
			result.put("code", "111111");
			result.put("msg", "获取成功,数据为空");
		}
		String string = JSONObject.fromObject(result).toString();
		return string;
	}
	
	
	
	/**
	 * 添加一个角色
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public  boolean commit(Role param) throws Exception{
		String product =  (String) getSqlMapClientTemplate().insert("commitR",param);
		return product != null ? true : false;
	}
	/**
	 * 添加一个角色
	 * @param param
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public  Role changeRole(List<Role> list) throws Exception{
		final List<Role> tempList = list;
		
		Role product = getSqlMapClientTemplate().execute(new SqlMapClientCallback<Role>() {
			 Role role;
			@Override
			public Role doInSqlMapClient( SqlMapExecutor executor) throws SQLException{
		          executor.startBatch();
		 
		          for(Role bean : tempList)
		          {
		               //批量插入
		               //executor.insert("test.addList", bean);
		 
		               //批量删除
		               // executor.delete("test.deleteList", bean);
		 
		               //批量更新
		                executor.update("updateR", bean);
		                
		          }
					
		          //提交操作
		          executor.executeBatch();
		          return role;
		      }
		});
		return product;
	}
	
	
	
	/**
	 * 添加一个权限
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public  boolean commitPermission(Permission param) throws Exception{
		String product =  (String) getSqlMapClientTemplate().insert("commitPermission",param);
		return product != null ? true : false;
	}
	
	
	/**
	 * 修改权限是否启用
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public  Permission changePermission(List<Permission> list) throws Exception{
		final List<Permission> tempList = list;
		
		Permission product = getSqlMapClientTemplate().execute(new SqlMapClientCallback<Permission>() {
			Permission role;
			@Override
			public Permission doInSqlMapClient( SqlMapExecutor executor) throws SQLException{
		          executor.startBatch();
		 
		          for(Permission bean : tempList)
		          {
		               //批量插入
		               //executor.insert("test.addList", bean);
		 
		               //批量删除
		               // executor.delete("test.deleteList", bean);
		 
		               //批量更新
		                executor.update("updatePermission", bean);
		          }
					
		          //提交操作
		          executor.executeBatch();
		          return role;
		      }
		});
		return product;
	}
	
	
	/**
	 * 根据角色id 查询某个角色
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public  Role selectByRoletId(String id) throws Exception{
		return (Role)getSqlMapClientTemplate().queryForObject("selectByRoleId",id);
	}
	/**
	 * 根据角色id 查询某个权限
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public  Permission selectByPermissiontId(String id) throws Exception{
		return (Permission)getSqlMapClientTemplate().queryForObject("selectByPermissionId",id);
	}
	/**
	 * 删除一个角色 只有超级管理员有权删除
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public  boolean delete(Role param) throws Exception{
		int res = getSqlMapClientTemplate().delete("deleteR", param);
		return res > 0 ? true : false;
	}
	/**
	 * 删除一个权限 只有超级管理员有权删除
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public  boolean deletePermission(Permission param) throws Exception	{
		int res = getSqlMapClientTemplate().delete("deletePermission", param);
		return res > 0 ? true : false;
	}
	/**
	 * 查询角所有权限
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<RolePermission> selectPermissionForRoleId(String id) throws Exception {
		return (List<RolePermission>)getSqlMapClientTemplate().queryForList("selectByRolePermissionid", id);
	}
	/**
	 * 根据角色启动状态
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<Role> selectStartRole(String id) throws Exception {
		return (List<Role>)getSqlMapClientTemplate().queryForList("selectByRoleisUse", id);
	}
	
	/**
	 * 为角色添加一个权限
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public String insertPermissionForRoleId(RolePermission id) throws Exception {
		String product =  (String) getSqlMapClientTemplate().insert("commitRolePermission",id);
		return product;
	}
	/**
	 * 查询所有已经启动的权限
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<Permission> selelctStartPermission(String id) throws Exception {
		return (List<Permission>)getSqlMapClientTemplate().queryForList("selectByPermissionisUse", id);
	}
	/**
	 * 删除一个权限根据角色id
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public String deletePermissionForRoleId(RolePermission id) throws Exception {
		int res = getSqlMapClientTemplate().delete("deleteRolePermission", id);
		
		return res>0?"1":"0";
	}
	/**
	 * 校验是否已经提添加了此权限
	 * @param rolePermission
	 * @return
	 * @throws Exception
	 */
	public boolean checkPermissionRole(RolePermission rolePermission)throws Exception {
	RolePermission  result = (RolePermission)getSqlMapClientTemplate().queryForObject("check", rolePermission);
	return result!=null?true:false;
	}
	/**
	 * 
	 * @param 根基角色id查询此角色下的所有用户
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<UserRole> queryAllUserWithPrerid(String id)throws Exception{
		return (List<UserRole>)getSqlMapClientTemplate().queryForList("selectAllUWithRoleid", id);
		
	}
	
}
