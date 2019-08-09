package com.aryans.library.model.DataBase;

public interface OrdersDataBase {
	public String getInsertQuery();
	public String getOrderByIdQuery();
	public String getBookByOrderIdQuery();
	public String getActiveUserByOrderIdQuery();
}
