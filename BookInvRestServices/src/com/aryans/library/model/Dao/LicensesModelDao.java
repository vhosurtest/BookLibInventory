package com.aryans.library.model.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.aryans.library.model.LicenseModel;
import com.aryans.library.model.DataBase.LicensesDataBase;
import com.aryans.library.model.Mapper.LicenseRowMapper;

@Repository
public class LicensesModelDao {

	@Autowired
	JdbcTemplate mjdbcTemplate;
	
	@Autowired
	LicensesDataBase mLicenseDatabase;
	
	public boolean insertLicenses(Object[] values) {
		return mjdbcTemplate.update(mLicenseDatabase.insertLicensesQuery(), values) > 0 ? true : false;
	}
	
	public LicenseModel getLicenseById(Long id) {
		return mjdbcTemplate.queryForObject(mLicenseDatabase.getLicensesByIDQuery(), new Object[] {id}, new LicenseRowMapper());
	}
	
	public List<LicenseModel> getLicensesByUserId(Long id) {
		return mjdbcTemplate.query(mLicenseDatabase.getUserLicenseByUserIdQuery(), new Object[] {id}, new LicenseRowMapper());
	}
}
