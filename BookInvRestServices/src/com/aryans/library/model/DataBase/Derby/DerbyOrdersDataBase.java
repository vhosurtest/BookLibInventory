package com.aryans.library.model.DataBase.Derby;

import org.springframework.stereotype.Component;

import com.aryans.library.model.DataBase.OrdersDataBase;

@Component
public class DerbyOrdersDataBase implements OrdersDataBase {

	@Override
	public String getInsertQuery() {
		return "INSERT INTO ORDERS(USER_ID, BOOK_ID, USER_NAME, ORDER_START_DATE, ORDER_END_DATE) VALUES (?,?,?, ?, ?)";
	}

	@Override
	public String getOrderByIdQuery() {
		return "SELECT * FROM ORDERS WHERE ORDER_ID=?";
	}

	@Override
	public String getBookByOrderIdQuery() {
		return "SELECT * FROM ORDERS WHERE BOOK_ID=?";
	}

	@Override
	public String getActiveUserByOrderIdQuery() {
		return "SELECT * FROM ORDERS WHERE USER_ID=? AND (ORDER_END_DATE < CURRENT_TIMESTAMP)";
	}

}
