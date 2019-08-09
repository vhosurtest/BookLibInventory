package com.aryans.library.model;

public class BooksModel {
	int bookId;
	int total_qty;
	String gener;
	float price;
	String images;
	String description;
	String keywords;
	String bkName;
	
	public static final String BOOK_ID = "BOOK_ID";
	public static final String TOTAL_QTY = "TOTAL_QTY";
	public static final String GENRE = "GENRE";
	public static final String PRICE = "PRICE";
	public static final String IMAGES = "IMAGES";
	public static final String DESCRIPTION = "DESCRIPTION";
	public static final String KEYWORDS = "KEYWORDS";
	public static final String BOOK_NAME = "BOOK_NAME";
	
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public int getTotal_qty() {
		return total_qty;
	}
	public void setTotal_qty(int total_qty) {
		this.total_qty = total_qty;
	}
	public String getGener() {
		return gener;
	}
	public void setGener(String gener) {
		this.gener = gener;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getImages() {
		return images;
	}
	public void setImages(String images) {
		this.images = images;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public String getBkName() {
		return bkName;
	}
	public void setBkName(String bkName) {
		this.bkName = bkName;
	}
	
}
