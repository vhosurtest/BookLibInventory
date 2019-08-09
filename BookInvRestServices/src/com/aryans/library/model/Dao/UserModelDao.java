package com.aryans.library.model.Dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.aryans.library.model.UserModel;
import com.aryans.library.model.DataBase.UserDataBase;
import com.aryans.library.model.Mapper.UserRowMapper;

@Repository
public class UserModelDao {
	
	@Autowired
	private JdbcTemplate mJdbcTemplate;
	
	@Autowired
	private UserDataBase mUserDataBase;
	
	/**
	 * Get the user row by USER_ID value
	 * 
	 * @param id
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public UserModel getUserById(long id) throws ClassNotFoundException, SQLException {
		return mJdbcTemplate.queryForObject(mUserDataBase.getUserIdQuery(), new Object[] {id}, new UserRowMapper());
	}
	
	/**
	 * Get the user row by USER_NAME value
	 * 
	 * @param id
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public UserModel getUserByName(String name) throws ClassNotFoundException, SQLException {
		return mJdbcTemplate.queryForObject(mUserDataBase.getUserByNameQuery(), new Object[] {name}, new UserRowMapper());
	}
	
	/**
	 * Method to insert User row
	 * Assuming that order of values are maintained as per the query.
	 * 
	 * @param values - list of column values
	 * @return true if insertion is successful else false.
	 */
	public boolean insertUser(Object[] values) {
		return (mJdbcTemplate.update(mUserDataBase.getInsertUserQuery(), values) == 0) ? false : true;
	}
	
	/**
	 * Method to get the user's password by user name.
	 * 
	 * @param uName
	 * @return
	 */
	public String getUserPassByName(String uName) {
		return mJdbcTemplate.queryForObject(mUserDataBase.getUserPassByName(),new Object[] {uName},String.class);
	}
	
	/**
	 * Method to return list of all the users in the DB 
	 * 
	 * @return list of user model objects.
	 */
	public List<UserModel> getAllUsers() {
		//System.out.println("Shinchan: " + mJdbcTemplate.queryForList(mUserDataBase.getAllUsers(), UserModel.class).size());
		return mJdbcTemplate.query(mUserDataBase.getAllUsers(), new UserRowMapper());
	}
}
