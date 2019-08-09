package com.aryans.library.model.DataBase.Derby;

import org.springframework.stereotype.Component;

import com.aryans.library.model.DataBase.LicensesDataBase;

@Component
public class DerbyLicensesDatabase implements LicensesDataBase {

	@Override
	public String insertLicensesQuery() {
		return "INSERT INTO LICENSES(USER_ID,MAX_QTY,LICENSE_START_DATE,LICENSE_END_DATE) VALUES (?,?,?,?)";
	}

	@Override
	public String getLicensesByIDQuery() {
		return "SELECT * FROM LICENSES WHERE LICENSE_ID=?";
	}

	@Override
	public String getUserLicenseByUserIdQuery() {
		return "SELECT * FROM LICENSES WHERE USER_ID=?";
	}

}
