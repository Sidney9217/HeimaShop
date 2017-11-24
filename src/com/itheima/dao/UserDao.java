package com.itheima.dao;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;

import com.itheima.domain.User;
import com.itheima.utils.DataSourceUtils;
import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

public class UserDao {
	
	public int regist(User user) throws SQLException{
		
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "insert into user values(?,?,?,?,?,?,?,?,?,?)";
		return runner.update(sql,user.getUid(),user.getUsername(),user.getPassword(),
				user.getName(),user.getEmail(),user.getTelephone(),user.getBirthday(),
				user.getSex(),user.getState(),user.getCode());
		
	}

	//¼¤»î
	public void active(String activeCode) throws SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "update user set state=? where code=?";
		runner.update(sql,1,activeCode);
	}
	
	
}
