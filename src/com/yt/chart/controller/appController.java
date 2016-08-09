package com.yt.chart.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.yt.chart.service.UserService;
import com.yt.chart.utils.CommonConstants;
import com.yt.chart.utils.JSONUtils;




@Controller
public class appController {
	
	private static Logger logger = LoggerFactory.getLogger(appController.class);
	
	
	@RequestMapping("/halo")
	public String hello(){
		System.out.println("scan");
		return "home";
	}
	@RequestMapping("/param")
	public String getParam(HttpServletRequest request){
		String name = request.getParameter("name");
		System.out.println(name);
		return "home";
	}
	@RequestMapping("/toregedit")
	public String torege(){
		logger.debug("=============================ÌøÞD");
		return "rege";
	}
	@RequestMapping("/regedit")
	public String torege(HttpServletRequest request,HttpServletResponse response){
		String username = request.getParameter("inputUsername");
		String password = request.getParameter("inputPassword");
		logger.debug("username==="+username);
		logger.debug("password==="+password);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("succ", "true");
		JSONUtils.obj2Writer(map, response,CommonConstants.CONTENT_TYPE_JSON_UTF8);
		return null;
	}

}
