package com.yt.chart.dao.impl;

import java.util.List;

import javax.annotation.Resource;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;
import com.yt.chart.dao.UserDao;
import com.yt.chart.pojo.Menu;
import com.yt.chart.pojo.User;


@Repository("userDao")
public class UserDaoImpl  implements UserDao {
	@Resource
    private SqlSessionFactory sqlSessionFactory;
	@Resource
	private SqlSession sqlSession;
	@Override
	public User getUserByName(String username) {
		// TODO Auto-generated method stub
		//SqlSession sqlSession = sqlSessionFactory.openSession();
		User user = (User)sqlSession.selectOne("com.yt.chart.dao.UserDao.selectUserByName",username);
		return user;
	}
	@Override
	public List<Menu> getMenu() {
		// TODO Auto-generated method stub
		List<Menu> list = (List)sqlSession.selectList("com.yt.chart.dao.UserDao.selectMenu");
		return list;
	}
}
