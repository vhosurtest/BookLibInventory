package com.aryans.library.model.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.aryans.library.model.BooksModel;
import com.aryans.library.model.DataBase.BooksDataBase;
import com.aryans.library.model.Mapper.BooksRowMapper;

@Repository
public class BooksModelDao {
	
	@Autowired
	private JdbcTemplate mJdbcTemplate;
	
	@Autowired
	private BooksDataBase mBooksDataBase;
	
	public BooksModel getBookByID(Long id) {
		return mJdbcTemplate.queryForObject(mBooksDataBase.getBookByIdQuery(), new Object[] {id}, new BooksRowMapper());
	}
	
	public boolean insertBook(Object[] values) {
		return mJdbcTemplate.update(mBooksDataBase.getInsertBookQuery(), values) > 0 ? true : false;
	}
	
	public List<BooksModel> getBooksByGenere(String genere) {
		return mJdbcTemplate.query(mBooksDataBase.getBooksByGenereQuery(), new Object[] {genere}, new BooksRowMapper());
	}
	
}
