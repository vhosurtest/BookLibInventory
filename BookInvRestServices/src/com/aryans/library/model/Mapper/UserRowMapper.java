package com.aryans.library.model.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.aryans.library.model.UserModel;

public class UserRowMapper implements RowMapper<UserModel> {

	@Override
	public UserModel mapRow(ResultSet rs, int arg1) throws SQLException {
		
		UserModel um = new UserModel();
		um.setUserId(rs.getInt(UserModel.USER_ID));
		um.setFilled(rs.getBoolean(UserModel.FILLED));
		um.setUserName(rs.getString(UserModel.USER_NAME));
		um.setUserType(rs.getString(UserModel.USER_TYPE));
		um.setParentUserId(rs.getInt(UserModel.PARENT_USER_ID));
		um.setPassword(rs.getString(UserModel.PASSWORD));
		
		return um;
	}

}
