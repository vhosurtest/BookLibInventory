package com.aryans.library.model;

import java.sql.Timestamp;

public class OrdersModel {
	Long orderId;
	Long userId;
	Long bookId;
	String userName;
	Timestamp orderStartDate;
	Timestamp orderEndDate;
	
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getBookId() {
		return bookId;
	}
	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Timestamp getOrderStartDate() {
		return orderStartDate;
	}
	public void setOrderStartDate(Timestamp orderStartDate) {
		this.orderStartDate = orderStartDate;
	}
	public Timestamp getOrderEndDate() {
		return orderEndDate;
	}
	public void setOrderEndDate(Timestamp orderEndDate) {
		this.orderEndDate = orderEndDate;
	}
	//Orders table columns
	public static final String ORDER_ID="ORDER_ID'";
	public static final String USER_ID="USER_ID";
	public static final String BOOK_ID="BOOK_ID";
	public static final String USER_NAME="USER_NAME";
	public static final String ORDER_START_DATE="ORDER_START_DATE";
	public static final String ORDER_END_DATE="ORDER_END_DATE";
	
}
