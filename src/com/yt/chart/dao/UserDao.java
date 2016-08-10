package com.yt.chart.dao;


import java.util.List;

import com.yt.chart.pojo.Menu;
import com.yt.chart.pojo.User;

public interface UserDao {
	public User getUserByName(String username);
	public List<Menu> getMenu();
}
