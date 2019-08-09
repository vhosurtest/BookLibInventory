package com.aryans.library.model.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.aryans.library.model.LicenseModel;
import com.aryans.library.model.UserModel;

public class LicenseRowMapper implements RowMapper<LicenseModel> {

	@Override
	public LicenseModel mapRow(ResultSet rs, int arg1) throws SQLException {
		LicenseModel lm = new LicenseModel();
		lm.setLicenseId(rs.getLong(LicenseModel.LICENSE_ID));
		lm.setAdminUserId(rs.getLong(LicenseModel.USER_ID));
		lm.setLicenseStartDate(rs.getTimestamp(LicenseModel.LICENSE_START_DATE));
		lm.setLicenseEndDate(rs.getTimestamp(LicenseModel.LICENSE_END_DATE));
		
		return lm;
	}

}
