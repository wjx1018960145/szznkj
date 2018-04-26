package com.szzn.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
 
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
 
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.szzn.mode.*;
import com.szzn.server.*;
 
public class FileOperateUtil {
	 public static String FILEDIR = "E:/tomcat/webapps/home/file/";
	 public static String IMAGESDIR = "E:/tomcat/webapps/home/images/";
	static  String tmpname;
	static String tmpnameImg;
	    /**
	     * 上传
	     * @param request
	     * @throws IOException
	     */
	    @SuppressWarnings("rawtypes")
		public static void upload(HttpServletRequest request,RollService service) throws IOException{
	    	
	    	System.out.println(request.getParameter("devno"));
	    	System.out.println(request.getParameter("name"));
	    	System.out.println(request.getParameter("type"));
	    	System.out.println(request.getParameter("des"));
	        MultipartHttpServletRequest mRequest = (MultipartHttpServletRequest) request;
	       
	        
	        Map<String, MultipartFile> fileMap = mRequest.getFileMap(); 
	    
	    	   File file = new File(FILEDIR);
		        if (!file.exists()) {
		            file.mkdir();
		        }
		        Iterator<Map.Entry<String, MultipartFile>> it = fileMap.entrySet().iterator();
		        while(it.hasNext()){
		            Map.Entry<String, MultipartFile> entry = it.next();
		            MultipartFile mFile = entry.getValue();
		            if(mFile.getSize() != 0 && !"".equals(mFile.getName())){
		            	 if ("main_img".equals(entry.getKey())) {
				    			write(mFile.getInputStream(), new FileOutputStream(IMAGESDIR+mFile.getOriginalFilename()+".png"));
				    			tmpnameImg = mFile.getOriginalFilename();
		            	 }else if ("filename1".equals(entry.getKey())) {
				    			 write(mFile.getInputStream(), new FileOutputStream(initFilePath(mFile.getOriginalFilename())));
							}
		            	
		               
		            }
		        }
		
	        
	        System.out.print(fileMap.size());
	     
	        
	        //写入数据库
	        RollList product = new RollList();
	        try {
				product.setId(generaterPrimaryKey());
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	        product.setKey(Encipher.generateRandomStr(10));
	       // product.setName(request.getParameter("name"));
	        product.setType(request.getParameter("type"));
	        product.setTitle("应用");
	        product.setDes(request.getParameter("des"));
	       // product.setDevno(request.getParameter("devno"));
	        product.setLink("/home/file/");
	        try {
				product.setLink(Encipher.getIpAndPort()+"/home/images/"+tmpnameImg+".png");
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
	        product.setTime(df.format(new Date()));
	        product.setTmpname(tmpname);
	        //product.setVersionnum(request.getParameter("version"));
	        //生成下载二维码 保存到图片库
	        String isSave = QRCode.saveqrCode(tmpname);
	        if (!"".endsWith(isSave)) {
	        	try {
					//product.setQrcode(Encipher.getIpAndPort()+isSave);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}else {
				return ;
			}
	        try {
				service.add(product);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	    private static String initFilePath(String name) {
	        String dir = getFileDir(name) + "";
	        File file = new File(FILEDIR);
	        if (!file.exists()) {
	            file.mkdir();
	        }
	        Long num = new Date().getTime();
	        Double d = Math.random()*num;
	       System.out.println((file.getPath() + "/" + num + d.longValue() + "_" + name).replaceAll(" ", "-").substring(28));
	       tmpname = (file.getPath() + "/" + num + d.longValue() + "_" + name).replaceAll(" ", "-").substring(28);
	        return (file.getPath() + "/" + num + d.longValue() + "_" + name).replaceAll(" ", "-");
	    }
	    private static int getFileDir(String name) {
	        return name.hashCode() & 0xf;
	    }
	    public static void download(String downloadfFileName, ServletOutputStream out) {
	        try {
	            FileInputStream in = new FileInputStream(new File(FILEDIR + "/" + downloadfFileName));
	            write(in, out);
	        } catch (FileNotFoundException e) {
	            try {
	                FileInputStream in = new FileInputStream(new File(FILEDIR + "/"
	                        + new String(downloadfFileName.getBytes("iso-8859-1"),"utf-8")));
	                write(in, out);
	            } catch (IOException e1) {              
	                e1.printStackTrace();
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }       
	    }
	    /**
	     * 写入数据
	     * @param in
	     * @param out
	     * @throws IOException
	     */
	    public static void write(InputStream in, OutputStream out) throws IOException{
	        try{
	            byte[] buffer = new byte[1024];
	            int bytesRead = -1;
	            while ((bytesRead = in.read(buffer)) != -1) {
	                out.write(buffer, 0, bytesRead);
	            }
	            out.flush();
	        } finally {
	            try {
	                in.close();
	            }
	            catch (IOException ex) {
	            }
	            try {
	                out.close();
	            }
	            catch (IOException ex) {
	            }
	        }
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
		public static String getTmpname() {
			return tmpname;
		}
		public static void setTmpname(String tmpname) {
			FileOperateUtil.tmpname = tmpname;
		}
		
		
		
		
}
