package com.szzn.utils;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Hashtable;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

public abstract class QRCode {
	public static String FILEDIR = "E:/tomcat/webapps/home/images/";
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static String saveqrCode(String filename){
		String path = null;
		String text = "你好";   
        int width = 100;   
        int height = 100;   
        String format = "png";   
        Hashtable hints= new Hashtable();   
        hints.put(EncodeHintType.CHARACTER_SET, "utf-8");   
         BitMatrix bitMatrix = null;
		try {
			bitMatrix = new MultiFormatWriter().encode(Encipher.getIpAndPort()+"/home/file/"+filename, BarcodeFormat.QR_CODE, width, height,hints);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   
         File outputFile = new File(FILEDIR+filename+".png");   
         try {
			MatrixToImageWriter.writeToFile(bitMatrix, format, outputFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         return path ="/home/images/"+filename+".png";
	}
	public static void main(String[] args){
		//QRCode.saveqrCode("15017449816711445203144333_dzj.rar");
		QRCode.delete();
	}
	public static void delete(){
		File file = new File("E:/tomcat/webapps/home/file/1501754373033891836805694_dzj.rar");
		if (file.exists()) {
			
			System.out.println("已存在");
			file.delete();
		}else {
			
		}
		
	}
	
	
}
