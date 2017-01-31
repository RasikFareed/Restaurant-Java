package com.restaurant.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.restaurant.model.ViewOrderDetails;
import com.restaurant.util.ConnectionUtil;

public class ViewOrderDetailsDAO {

	private final JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();

	public List<ViewOrderDetails> list() {

		String sql = "SELECT * FROM view_order_details";
		return jdbcTemplate.query(sql, (rs, rowNum) -> {
			ViewOrderDetails viewOrderDetails = new ViewOrderDetails();
			viewOrderDetails.setOrderedId(rs.getInt("ordered_id"));
			viewOrderDetails.setSeatno(rs.getString("seat_no"));
			viewOrderDetails.setOrderedItem(rs.getString("ordered_item"));
			viewOrderDetails.setQuantity(rs.getInt("quantity"));
			viewOrderDetails.setOrderedTime(rs.getTime("ordered_time").toLocalTime());
			viewOrderDetails.setOrderedDate(rs.getDate("ordered_date").toLocalDate());
			viewOrderDetails.setState(rs.getString("state"));
			return viewOrderDetails;

		});
	}

}
