package com.restaurant.dao;

import java.sql.Types;
import java.time.LocalTime;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import com.restaurant.util.*;

public class ProcedureDAO {

	private final JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();

	public String placeOrder(String seatno, String items, String quantity, LocalTime orderTime) {
		SimpleJdbcCall call = new SimpleJdbcCall(jdbcTemplate).withProcedureName("place_order").declareParameters(
				new SqlParameter("seatno", Types.VARCHAR), new SqlParameter("_list1", Types.LONGNVARCHAR),
				new SqlParameter("_list2", Types.LONGNVARCHAR), new SqlParameter("order_time", Types.TIME),
				new SqlOutParameter("message", Types.VARCHAR));
		call.setAccessCallParameterMetaData(false);
		SqlParameterSource in = new MapSqlParameterSource().addValue("seatno", seatno).addValue("_list1", items)
				.addValue("_list2", quantity).addValue("order_time", orderTime);
		Map<String, Object> execute = call.execute(in);
		return (String) execute.get("message");

	}
}
