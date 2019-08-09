package com.aryans.library.model.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.aryans.library.model.BooksModel;

public class BooksRowMapper implements RowMapper<BooksModel> {

	@Override
	public BooksModel mapRow(ResultSet rs, int arg1) throws SQLException {
		
		BooksModel bm = new BooksModel();
		bm.setBkName(rs.getString(BooksModel.BOOK_NAME));
		bm.setBookId(rs.getInt(BooksModel.BOOK_ID));
		bm.setDescription(rs.getString(BooksModel.DESCRIPTION));
		bm.setGener(rs.getString(BooksModel.GENRE));
		bm.setImages(rs.getString(BooksModel.IMAGES));
		bm.setKeywords(rs.getString(BooksModel.KEYWORDS));
		bm.setPrice(rs.getFloat(BooksModel.PRICE));
		bm.setTotal_qty(rs.getInt(BooksModel.TOTAL_QTY));
		
		return bm;
	}

}
