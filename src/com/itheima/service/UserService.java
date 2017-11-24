package com.itheima.service;

import java.sql.SQLException;

import com.itheima.dao.UserDao;
import com.itheima.domain.User;
import com.sun.javafx.geom.AreaOp.IntOp;

public class UserService {
	
	public boolean regist(User user) {
		
		UserDao dao = new UserDao();
		int row = 0;
		try {
			row = dao.regist(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return row>0?true:false;
	}

	//¼¤»î
	public void active(String activeCode) {
		UserDao dao = new UserDao();
		try {
			dao.active(activeCode);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
