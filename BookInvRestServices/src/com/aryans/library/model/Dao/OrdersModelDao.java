package com.aryans.library.model.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.aryans.library.model.OrdersModel;
import com.aryans.library.model.DataBase.OrdersDataBase;
import com.aryans.library.model.Mapper.OrdersRowMapper;

@Repository
public class OrdersModelDao {
	@Autowired
	private JdbcTemplate mJdbcTemplate;
	
	@Autowired
	private OrdersDataBase mOrderDataBase;
	
	public OrdersModel getOrderById(Long id) {		
		return mJdbcTemplate.queryForObject(mOrderDataBase.getOrderByIdQuery(), new Object[] {id}, new OrdersRowMapper());
	}
	
	public boolean insertQuery(Object[] values) {
		return mJdbcTemplate.update(mOrderDataBase.getInsertQuery(), values) > 0? true:false;
	}
	
	public OrdersModel getUserByOrderId(Long userId) {
		return mJdbcTemplate.queryForObject(mOrderDataBase.getActiveUserByOrderIdQuery(), new Object[] {userId}, new OrdersRowMapper());
	}
}
