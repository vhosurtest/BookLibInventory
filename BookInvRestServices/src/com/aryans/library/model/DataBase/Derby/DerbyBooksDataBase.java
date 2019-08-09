package com.aryans.library.model.DataBase.Derby;

import org.springframework.stereotype.Component;

import com.aryans.library.model.DataBase.BooksDataBase;

@Component
public class DerbyBooksDataBase implements BooksDataBase {

	@Override
	public String getBookByIdQuery() {
		return "SELECT * from BOOKS WHERE BOOK_ID = ?";
	}

	@Override
	public String getInsertBookQuery() {
		return "INSERT INTO BOOKS(TOTAL_QTY, GENRE, PRICE, IMAGES, DESCRIPTION, KEYWORDS, BOOK_NAME) VALUES (?, ?, ?, ?, ?,?, ?)";
	}

	@Override
	public String getBooksByGenereQuery() {
		return "SELECT * FROM BOOKS WHERE GENERE=?";
	}
	
}
