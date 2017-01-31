package com.restaurant.dao;

import java.sql.Types;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import com.restaurant.util.ConnectionUtil;

public class ProcedureAddFoodDAO {
	private final JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();

	public String addFood(String menuItem, String foodType) {
		SimpleJdbcCall call = new SimpleJdbcCall(jdbcTemplate).withProcedureName("add_food").declareParameters(
				new SqlParameter("Item", Types.VARCHAR), new SqlParameter("foodtype", Types.VARCHAR),
				new SqlOutParameter("add_message", Types.VARCHAR));
		call.setAccessCallParameterMetaData(false);
		SqlParameterSource in = new MapSqlParameterSource().addValue("Item", menuItem).addValue("foodtype", foodType);
		Map<String, Object> execute = call.execute(in);
		return (String) execute.get("add_message");

	}

}
