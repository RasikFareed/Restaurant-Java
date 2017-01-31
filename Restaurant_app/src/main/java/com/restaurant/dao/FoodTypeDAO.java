package com.restaurant.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.restaurant.model.*;
import com.restaurant.util.*;

public class FoodTypeDAO {

	private final JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();

	public List<FoodType> list() {
		String sql = "SELECT id,Type,From_time,To_time,quantity FROM foodtype";
		return jdbcTemplate.query(sql, (rs, rowNum) -> {
			return convert(rs);

		});

	}

	public FoodType convert(ResultSet rs) throws SQLException {
		FoodType foodType = new FoodType();
		foodType.setFoodTypeId(rs.getInt("id"));
		foodType.setFoodType(rs.getString("Type"));
		foodType.setFromTime(rs.getTime("From_time").toLocalTime());
		foodType.setToTime(rs.getTime("To_time").toLocalTime());
		foodType.setQuantity(rs.getInt("quantity"));

		return foodType;
	}

}
