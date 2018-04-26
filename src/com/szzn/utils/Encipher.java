package com.szzn.utils;

import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

import com.sun.org.apache.regexp.internal.recompile;





/**
 * ������
 * @author Administrator
 *
 */
public class Encipher {

	
	private static Encipher encipherHelpEncipher = null;
	
	public static Encipher getInstance(){
		if (encipherHelpEncipher == null) {
			encipherHelpEncipher = new Encipher();
		}
		return encipherHelpEncipher;
	}
	/**
	 * md5加密
	 */
	
	public static String md5(String string) {
	     byte[] hash;
	     try {
	         hash = MessageDigest.getInstance("MD5").digest(string.getBytes("UTF-8"));
	     } catch (NoSuchAlgorithmException e) {
	         throw new RuntimeException("Huh, MD5 should be supported?", e);
	     } catch (UnsupportedEncodingException e) {
	         throw new RuntimeException("Huh, UTF-8 should be supported?", e);
	     }

	     StringBuilder hex = new StringBuilder(hash.length * 2);
	     for (byte b : hash) {
	         if ((b & 0xFF) < 0x10) hex.append("0");
	         hex.append(Integer.toHexString(b & 0xFF));
	     }
	     return hex.toString();
	 }
	/**
	 * 生成不重复随机字符串包括字母数字
	 *
	 * @param len
	 * @return
	 */
	public static String generateRandomStr(int len) {
	    //字符源，可以根据需要删减
	    String generateSource = "0123456789abcdefghigklmnopqrstuvwxyz";
	    String rtnStr = "";
	    for (int i = 0; i < len; i++) {
	        //循环随机获得当次字符，并移走选出的字符
	        String nowStr = String.valueOf(generateSource.charAt((int) Math.floor(Math.random() * generateSource.length())));
	        rtnStr += nowStr;
	        generateSource = generateSource.replaceAll(nowStr, "");
	    }
	    return rtnStr;
	}
	 /**
	 * 
	 * @return
	 * @throws Exception
	 */
	public static synchronized String generaterPrimaryKey() throws Exception{   
        
        UUID uuid = UUID.randomUUID();   
           
        if (null==uuid || "".equals(uuid.toString())){   
            throw new NullPointerException("uuid is null");   
        }   
           
        String primaryKey = String.valueOf(uuid);   
           
        if (null!=primaryKey && primaryKey.contains("-")){   
            primaryKey = primaryKey.replaceAll("-", "");    
        }   
           
        return primaryKey;   
    }
	
	public static String getIpAndPort() throws Exception{
			return "http://"+InetAddress.getLocalHost().getHostAddress().toString()+":8080";
		
	}
	
	public static StringBuffer jsonForm(String s){
		int level = 0;
        //存放格式化的json字符串
        StringBuffer jsonForMatStr = new StringBuffer();
        for(int index=0;index<s.length();index++)//将字符串中的字符逐个按行输出
        {
            //获取s中的每个字符
            char c = s.charAt(index);
//          System.out.println(s.charAt(index));
             
            //level大于0并且jsonForMatStr中的最后一个字符为\n,jsonForMatStr加入\t
            if (level > 0 && '\n' == jsonForMatStr.charAt(jsonForMatStr.length() - 1)) {
                jsonForMatStr.append(getLevelStr(level));
//                System.out.println("123"+jsonForMatStr);
            }
            //遇到"{"和"["要增加空格和换行，遇到"}"和"]"要减少空格，以对应，遇到","要换行
            switch (c) {
            case '{':
            case '[':
                jsonForMatStr.append(c + "\n");
                level++;
                break;
            case ',':
                jsonForMatStr.append(c + "\n");            
                break;
            case '}':
            case ']':
                jsonForMatStr.append("\n");
                level--;
                jsonForMatStr.append(getLevelStr(level));
                jsonForMatStr.append(c);
                break;
            default:
                jsonForMatStr.append(c);
                break;
            }
        }
        System.out.println(jsonForMatStr);
        return jsonForMatStr;
	}
	  private static String getLevelStr(int level) {
	        StringBuffer levelStr = new StringBuffer();
	        for (int levelI = 0; levelI < level; levelI++) {
	            levelStr.append("\t");
	        }
	        return levelStr.toString();
	    }
	
}
