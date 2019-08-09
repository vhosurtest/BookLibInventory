package com.aryans.library.model.DataBase.Derby;

import org.springframework.stereotype.Component;

import com.aryans.library.model.DataBase.UserDataBase;

@Component
public class DerbyUserDataBase implements UserDataBase {

	@Override
	public String getUserIdQuery() {
		return "Select * from USERS where USER_ID=?";
	}
	
	@Override
	public String getInsertUserQuery() {
		return "INSERT INTO USERS (USER_TYPE, USER_NAME, PASSWORD, PARENT_USER_ID) VALUES (?, ?, ?, ?)";
	}
	
	@Override
	public String getUserByNameQuery() {
		return "Select * from USERS where USER_NAME=?";
	}
	
	@Override
	public String getUserPassByName() {
		return "Select PASSWORD from USERS where USER_NAME=?";
	}
	
	@Override
	public String getAllUsers() {
		return "Select * from USERS";
	}
	
}
