/**
 * 
 */
package com.example.demo.rowmapper;

import com.example.demo.model.Country;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Adwiti
 *
 */
public class CountryRowMapper implements RowMapper<Country> {

	@Override
	public Country mapRow(ResultSet rs, int rowNum) throws SQLException {
		Country country = new Country();
		country.setId(rs.getString(1));
		country.setName(rs.getString(2));
		country.setCapital(rs.getString(3));
		country.setCurrency(rs.getString(4));
		return country;
	}
}
