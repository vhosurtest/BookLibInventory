package com.aryans.library.model.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.aryans.library.model.OrdersModel;

public class OrdersRowMapper implements RowMapper<OrdersModel> {

	@Override
	public OrdersModel mapRow(ResultSet rs, int arg1) throws SQLException {
		
		OrdersModel om = new OrdersModel();
		om.setBookId(rs.getLong(OrdersModel.BOOK_ID));
		om.setOrderEndDate(rs.getTimestamp(OrdersModel.ORDER_END_DATE));
		om.setOrderId(rs.getLong(OrdersModel.ORDER_ID));
		om.setOrderStartDate(rs.getTimestamp(OrdersModel.ORDER_START_DATE));
		om.setUserId(rs.getLong(OrdersModel.USER_ID));
		om.setUserName(rs.getString(OrdersModel.USER_NAME));
		
		return om;
	}

}
