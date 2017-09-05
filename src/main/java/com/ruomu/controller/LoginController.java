package com.ruomu.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import javax.servlet.http.HttpServletRequest;

import com.ruomu.pojo.User;
import com.ruomu.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="/Login")
public class LoginController {
	  private Logger logger = Logger.getLogger(LoginController.class);

	
	@Autowired
	private UserService userService;

	@RequestMapping(value="/SignIn")//接口的URL
	public Object  getItemParamList(@RequestParam("user") String user,

			HttpServletRequest request) throws Exception{
		User a = userService.selectByZhangHao(user);

			return a;
			
	}
	

	
}
