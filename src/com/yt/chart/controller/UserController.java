package com.yt.chart.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yt.chart.pojo.Menu;
import com.yt.chart.pojo.User;
import com.yt.chart.service.UserService;
import com.yt.chart.utils.CommonConstants;
import com.yt.chart.utils.JSONUtils;

@Controller  
public class UserController{
	@Autowired
	private UserService userService;
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	private static Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@RequestMapping(value="/testgetUserName1")
	public String getUsername1(HttpServletRequest request,HttpServletResponse response)  {
		Map<String,Object> map = new HashMap<String,Object>();
		String username = request.getParameter("inputUsername");
		String password = request.getParameter("inputPassword");
		logger.debug("username==="+username);
		logger.debug("password==="+password);
		User user = userService.getUserByName(username);
		response.setContentType(CommonConstants.CONTENT_TYPE_JSON_UTF8);
		if(null == user){
			logger.debug("²éÑ¯³ö´í");
			map.put("resrultcode", "0002");
		}else{
			String password1 = user.getPassword();
			if(!password.equals(password1)){
				map.put("resrultcode", "0001");
			}else{
				map.put("resrultcode", "0000");
			}
		}
		JSONUtils.obj2Writer(map, response,CommonConstants.CONTENT_TYPE_JSON_UTF8);
		return null;
	}
	@RequestMapping(value="/view/getMenu")
	public String getMenu(HttpServletResponse requset,HttpServletResponse response){
		Map<String,Object> map = new HashMap<String,Object>();
		List<Menu> list  = userService.getMenu();
		map.put("result", list);
		JSONUtils.obj2Writer(map, response,CommonConstants.CONTENT_TYPE_JSON_UTF8);
		return null;
	}

}
