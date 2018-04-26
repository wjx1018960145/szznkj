package com.szzn.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/test"})
public class InterfaceTest {

	/**
	 * @param args
	 */
	@RequestMapping({"test"})
	public String test(){
		System.out.println("拉取数据");
		return "";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
