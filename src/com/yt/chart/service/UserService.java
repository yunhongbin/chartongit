package com.yt.chart.service;


import java.util.List;

import com.yt.chart.pojo.Menu;
import com.yt.chart.pojo.User;


public interface UserService {
	public User getUserByName(String username);
	public List<Menu> getMenu();
}
