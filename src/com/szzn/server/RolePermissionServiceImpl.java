package com.szzn.server;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Service;
import com.szzn.mode.Permission;
import com.szzn.mode.Role;
import com.szzn.mode.RolePermission;
import com.szzn.mode.User;
import com.szzn.mode.UserRole;
import com.szzn.utils.Encipher;
import com.szzn.dao.RolePermissionDao;
import com.szzn.dao.UserDao;

@Service
public class RolePermissionServiceImpl implements RolePermissionService {

	@Resource
	private RolePermissionDao dao;
	@Resource
	private UserDao userDao;

	@Override
	public String queryAllForRole(int Producttype) throws Exception {
		return dao.selectAll();
	}

	@Override
	public Role queryByRoleId(int id) throws Exception {
		return dao.selectByRoletId(String.valueOf(id));
	}

	@Override
	public boolean addRole(HttpServletRequest request) throws Exception {
		Role role = new Role();
		role.setUid(Encipher.generaterPrimaryKey());

		role.setId(request.getParameter("id"));
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 设置日期格式
		role.setCtime(df.format(new Date()));
		role.setDescription(new String(request.getParameter("description")
				.getBytes("iso-8859-1"), "utf-8"));
		role.setIsUse(request.getParameter("isUse"));
		role.setName(new String(request.getParameter("name").getBytes(
				"iso-8859-1"), "utf-8"));
		// 先查找当前角色id是否存在
		String tmpidString = request.getParameter("id");
		if ("".equals(tmpidString)) {
			return false;
		}
		Role role2 = dao.selectByRoletId(tmpidString);
		if (role2 != null) {
			return false;
		} else {
			if (dao.commit(role)) {
				dao.installLog(2, "admin");
				return true;
			} else {
				return false;
			}

		}

	}

	@Override
	public String deleteRole(HttpServletRequest request) throws Exception {
		String tmpidString = request.getParameter("id");
		Role role = new Role();
		role.setId(request.getParameter("id"));
		Map<String, Object> map = new HashMap<String, Object>();
		Role role2 = dao.selectByRoletId(tmpidString);

		if ("".equals(tmpidString)) {
			map.put("code", "222222");
			map.put("msg", "id不能为空");
			return JSONObject.fromObject(map).toString();
		}

		if (role2 == null) {
			map.put("code", "333333");
			map.put("msg", "id不存在");
			return JSONObject.fromObject(map).toString();
		}

		if (dao.delete(role)) {
			map.put("code", Integer.valueOf("20000"));
			map.put("msg", "删除成功");
		} else {
			map.put("code", "111111");
			map.put("msg", "删除失败");
		}

		return JSONObject.fromObject(map).toString();
	}

	@Override
	public String queryAllForPermission(int type) throws Exception {
		return dao.selectAllforPermission();
	}

	@Override
	public Permission queryByPermissionId(int id) throws Exception {
		return dao.selectByPermissiontId(String.valueOf(id));
	}

	@Override
	public boolean addPermission(HttpServletRequest request) throws Exception {
		// TODO Auto-generated method stub
		Permission permission = new Permission();
		permission.setUid(Encipher.generaterPrimaryKey());

		permission.setId(request.getParameter("id"));
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 设置日期格式
		permission.setCtime(df.format(new Date()));
		permission.setDescription(new String(request
				.getParameter("description").getBytes("iso-8859-1"), "utf-8"));
		permission.setIsUse(request.getParameter("isUse"));
		permission.setName(new String(request.getParameter("name").getBytes(
				"iso-8859-1"), "utf-8"));
		permission.setOperator(request.getParameter("token"));
		// 先查找当前角色id是否存在
		String tmpidString = request.getParameter("id");
		if ("".equals(tmpidString)) {
			return false;
		}
		Permission permission2 = dao.selectByPermissiontId(tmpidString);
		if (permission2 != null) {
			return false;
		} else {
			return dao.commitPermission(permission);
		}

	}

	@Override
	public String deletePermission(HttpServletRequest request) throws Exception {
		String tmpidString = request.getParameter("id");
		Permission permission = new Permission();
		permission.setId(request.getParameter("id"));
		Map<String, Object> map = new HashMap<String, Object>();
		Permission permission2 = dao.selectByPermissiontId(tmpidString);

		if ("".equals(tmpidString)) {
			map.put("code", Integer.valueOf("30000"));
			map.put("msg", "id不能为空");
			return JSONObject.fromObject(map).toString();
		}

		if (permission2 == null) {
			map.put("code", Integer.valueOf("30000"));
			map.put("msg", "id不存在");
			return JSONObject.fromObject(map).toString();
		}

		if (dao.deletePermission(permission)) {
			map.put("code", Integer.valueOf("20000"));
			map.put("msg", "删除成功");
		} else {
			map.put("code", Integer.valueOf("20001"));
			map.put("msg", "删除失败");
		}

		return JSONObject.fromObject(map).toString();
	}

	@Override
	public String changPermission(HttpServletRequest request) throws Exception {
		@SuppressWarnings("unchecked")
		List<Permission> list = (List<Permission>) JSONArray.toCollection(
				JSONArray.fromObject(request.getParameter("list")),
				Permission.class);
		@SuppressWarnings("unchecked")
		List<Permission> listdata = (List<Permission>) JSONArray.toCollection(
				JSONArray.fromObject(request.getParameter("dataSouces")),
				Permission.class);
		String direction = request.getParameter("direction");
		Map<String, String> map = new HashMap<String, String>();
		if (direction.equals("left")) {
			@SuppressWarnings("unchecked")
			List<Permission> keys = (List<Permission>) JSONArray.toCollection(
					JSONArray.fromObject(request.getParameter("keys")),
					Permission.class);

			for (Permission role : keys) {
				if (dao.selectPermissionForRoleId(role.getId()).size() != 0) {
					map.put("code", "111111");
					map.put("msg", "有未解除的角色权限关系请先接触关系再停用");
					return JSONObject.fromObject(map).toString();
				}
			}
		}

		for (Permission role : listdata) {
			role.setIsUse("0");
		}
		dao.changePermission(listdata);
		for (Permission role : list) {
			role.setIsUse("1");
		}
		dao.changePermission(list);
		map.put("code", "000000");
		map.put("msg", "切换成功");
		return JSONObject.fromObject(map).toString();
	}

	@Override
	public String changRole(HttpServletRequest request) throws Exception {

		@SuppressWarnings("unchecked")
		List<Role> list = (List<Role>) JSONArray.toCollection(
				JSONArray.fromObject(request.getParameter("list")), Role.class);
		@SuppressWarnings("unchecked")
		List<Role> listdata = (List<Role>) JSONArray.toCollection(
				JSONArray.fromObject(request.getParameter("dataSouces")),
				Role.class);

		String direction = request.getParameter("direction");
		Map<String, String> map = new HashMap<String, String>();
		// String direction = request.getParameter("direction");
		// list.add(arg0)
		// List list = ;
		if (direction.equals("left")) {
			@SuppressWarnings("unchecked")
			List<Role> keys = (List<Role>) JSONArray.toCollection(
					JSONArray.fromObject(request.getParameter("keys")),
					Role.class);
			for (Role role : keys) {
				if (dao.selectPermissionForRoleId(role.getId()).size() != 0) {
					map.put("code", "111111");
					map.put("msg", "有未解除的角色权限关系请先接触关系再停用");
					return JSONObject.fromObject(map).toString();
				}
			}
		}

		for (Role role : listdata) {
			role.setIsUse("0");
		}
		// 先判断角色是否在
		dao.changeRole(listdata);
		for (Role role : list) {
			role.setIsUse("1");
		}

		dao.changeRole(list);
		map.put("code", "000000");
		map.put("msg", "切换成功");
		return JSONObject.fromObject(map).toString();
	}

	/**
	 * 解决角色下权限的问题
	 */

	@Override
	public String queryPermissionForRole(HttpServletRequest request)
			throws Exception {
		String id = request.getParameter("id");
		// 查询一个列表 根绝列表查询相应权限
		List<RolePermission> list = dao.selectPermissionForRoleId(id);
		Map<String, Object> bgMap = new HashMap<String, Object>();
		List<Map<String, String>> list2 = new ArrayList<Map<String, String>>();
		List<Permission> lisPermissions = new ArrayList<Permission>();
		List<Map<String, Object>> lsit = new ArrayList<>();
		Map<String, Object> tmmap = new HashMap<String, Object>();
		lsit.add(tmmap);
		for (RolePermission rolePermission : list) {
			// 根据查询出来的权限id 查询权限详情
			Permission permission = dao.selectByPermissiontId(rolePermission
					.getPermissionid());
			Map<String, String> map = new HashMap<String, String>();
			map.put("name", permission.getName());

			map.put("pid", rolePermission.getPermissionid());
			map.put("uid", rolePermission.getUid());
			list2.add(map);
			lisPermissions.add(permission);
		}

		// 查询所有已经启动的权限，和已经添加的做对比，把没有赋予的返回获取
		List<Permission> list3 = dao.selelctStartPermission("1");
		List<Permission> list4 = getDiffrent(list3, lisPermissions);
		System.out.println(list4);
		if (list.size() == 0) {
			bgMap.put("code", "111111");
			bgMap.put("msg", "该角色没有赋予任何权限");
			bgMap.put("body", list2);
			bgMap.put("permissions", getMapsList(list4));
			bgMap.put("rid", id);
		} else {
			bgMap.put("code", "000000");
			bgMap.put("msg", "获取成功");
			bgMap.put("body", list2);
			bgMap.put("permissions", getMapsList(list4));
			bgMap.put("rid", id);
		}
		return JSONObject.fromObject(bgMap).toString();
	}

	@Override
	public String addPermissionForRole(HttpServletRequest request)
			throws Exception {
		String id = request.getParameter("rid");
		String permissionid = request.getParameter("pid");
		RolePermission rolePermission = new RolePermission();
		rolePermission.setRoleid(id);
		rolePermission.setPermissionid(permissionid);
		rolePermission.setUid(Encipher.generaterPrimaryKey());
		Map<String, String> map = new HashMap<String, String>();
		// 先判断是否存在
		if (dao.checkPermissionRole(rolePermission)) {
			map.put("code", "222222");
			map.put("msg", "权限已存在");
			return JSONObject.fromObject(map).toString();
		} else {
			String result = dao.insertPermissionForRoleId(rolePermission);
			if (result != null) {
				map.put("code", "000000");
				map.put("msg", "添加成功");
			} else {
				map.put("code", "111111");
				map.put("msg", "添加失败");
			}
			return JSONObject.fromObject(map).toString();
		}
		// return JSONObject.fromObject(map).toString();

	}

	@Override
	public String deletePermissionForRole(HttpServletRequest request)
			throws Exception {
		String id = request.getParameter("rid");
		String permissionid = request.getParameter("pid");
		RolePermission rolePermission = new RolePermission();
		rolePermission.setRoleid(id);
		rolePermission.setPermissionid(permissionid);
		String result = dao.deletePermissionForRoleId(rolePermission);
		Map<String, String> map = new HashMap<String, String>();
		if (result.equals("1")) {
			map.put("code", "000000");
			map.put("msg", "删除成功");
		} else {
			map.put("code", "111111");
			map.put("msg", "删除失败");
		}
		return JSONObject.fromObject(map).toString();
	}

	@Override
	public String queryRoleForU(HttpServletRequest request) throws Exception {
		String id = request.getParameter("roleid");
		List<Map<String, Object>> bgList = new ArrayList<Map<String, Object>>();
		Map<String, Object> retuenMap = new HashMap<>();

		// 根据角色id先查询出所有的用户id
		List<UserRole> list = dao.queryAllUserWithPrerid(id);
		// 根据查询出来的id查询
		for (UserRole userRole : list) {

			// 查询用户表
			User user = userDao.queryUser(userRole.getUserid());
			
			if (user !=null) {
				Map<String, Object> map = new HashMap<>();
				map.put("nick", user.getNick());
				map.put("userid",user.getUserid());
				map.put("roleper", user.getRoles());
				bgList.add(map);
			}else {
				continue;
			}
			
		}
		if (bgList.size() > 0) {
			retuenMap.put("code", "000000");
			retuenMap.put("msg", "查询成功");
			retuenMap.put("body", bgList);
		} else {
			retuenMap.put("code", "300000");
			retuenMap.put("msg", "该角色没有用户");
		}

		return JSONObject.fromObject(retuenMap).toString();
	}

	@Override
	public String addRoleForU(HttpServletRequest request) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteRoleForU(HttpServletRequest request) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String queryallStartRole(HttpServletRequest request)
			throws Exception {

		List<Role> list = dao.selectStartRole("1");
		List<Map> bgList = new ArrayList<Map>();

		List<Map<String, Object>> lsit = new ArrayList<>();
		Map<String, Object> tmmap = new HashMap<String, Object>();
		lsit.add(tmmap);

		Map<String, Object> bgMap = new HashMap<String, Object>();
		for (Role role : list) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("rid", role.getId());
			map.put("id", role.getUid());
			map.put("children", lsit);
			map.put("name", role.getName());
			bgList.add(map);
		}
		if (list.size() == 0) {
			bgMap.put("code", "111111");
			bgMap.put("msg", "获取失败");
			bgMap.put("body", bgList);
		} else {
			bgMap.put("code", "000000");
			bgMap.put("msg", "获取成功");
			bgMap.put("body", bgList);
		}
		return JSONObject.fromObject(bgMap).toString();
	}

	/**
	 * 获取两个List的不同元素
	 * 
	 * @param list1
	 * @param list2
	 * @return
	 */
	@SuppressWarnings("unused")
	private static List<Permission> getDiffrent(List<Permission> list1,
			List<Permission> list2) {
		long st = System.nanoTime();
		List<Permission> diff = new ArrayList<Permission>();

		list1.removeAll(list2);

		/*
		 * for(Permission str:list1) { if(!list2.contains(str)) { diff.add(str);
		 * } }
		 */
		System.out.println("total times " + (System.nanoTime() - st));
		return list1;
	}

	@SuppressWarnings("unused")
	private static List<Map<String, String>> getMapsList(List<Permission> list) {

		List<Map<String, String>> lsiList = new ArrayList<Map<String, String>>();
		for (Permission permission : list) {
			Map<String, String> map = new HashMap<String, String>();
			map.put("name", permission.getName());
			map.put("pid", permission.getId());
			map.put("uid", permission.getUid());
			lsiList.add(map);
		}
		return lsiList;

	}

}
