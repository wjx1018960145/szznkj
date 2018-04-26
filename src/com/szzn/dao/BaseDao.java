package com.szzn.dao;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Component;


import com.ibatis.sqlmap.client.SqlMapClient;
import com.szzn.mode.Log;
import com.szzn.utils.Encipher;
@Component
public class BaseDao extends SqlMapClientDaoSupport {
	public static String LOGIN = "login"; 
	public static String LOGINOUT = "logout";
	public static String ADDROLE = "添加一个角色";
	@Resource(name = "sqlMapClient")
	private SqlMapClient sqlMapClient;
	
	@PostConstruct
	public void initSqlMapClient(){
		super.setSqlMapClient(sqlMapClient);
	}
	/**
	 * 写入日志log
	 * @param index
	 * @return
	 * @throws Exception
	 */
	public boolean installLog(int index,String userid)throws Exception {
		Log log = new Log();
		log.setAction(action(index));
		  SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		log.setAtime(df.format(new Date()));
		log.setUserid(userid);
		log.setId(Encipher.generateRandomStr(10));
		Log log2 = (Log)getSqlMapClientTemplate().insert("commitLog",log);
		return log2!=null?true:false;
	}
	private String action(int id) {
		String retuString = null;
		switch (id) {
		case 0:
			retuString = LOGIN;
			break;
			case 1:
			retuString = LOGINOUT;
			break;
			case 2:
				retuString = ADDROLE;
				break;
		default:
			break;
		}
		
		return retuString;
	}
	
}
