package com.yt.chart.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.chart.dao.UserDao;
import com.yt.chart.pojo.Menu;
import com.yt.chart.pojo.User;
import com.yt.chart.service.UserService;



@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	@Override
	public User getUserByName(String username) {
		// TODO Auto-generated method stub
		return userDao.getUserByName(username);
	}
	@Override
	public List<Menu> getMenu() {
		// TODO Auto-generated method stub
		return userDao.getMenu();
	}
	


}
