package com.yt.chart.utils;

import org.apache.ibatis.session.SqlSession;



public class MybatisUtil {
	
	public static void closeSession(SqlSession session){
		if(session !=null) session.close();
	}

}
