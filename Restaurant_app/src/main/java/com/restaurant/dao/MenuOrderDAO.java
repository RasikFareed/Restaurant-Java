package com.restaurant.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.restaurant.model.*;
import com.restaurant.util.*;

public class MenuOrderDAO {

	private final JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();

	public MenuOrder listByQuantity(int id) {
		String sql = "select id,menu_list,food_type,quantity FROM menuorder WHERE id=?";
		Object[] params = { id };

		return jdbcTemplate.queryForObject(sql, params, (rs, rowNum) -> {
			MenuOrder menuOrder = new MenuOrder();
			menuOrder.setMenuOrderId(rs.getInt("id"));

			Menu menus = new Menu();
			menus.setMenuId(rs.getInt("menu_list"));
			menuOrder.setMenuListId(menus);

			FoodType foodTypes = new FoodType();
			foodTypes.setFoodTypeId(rs.getInt("food_type"));
			menuOrder.setFoodTypeId(foodTypes);

			menuOrder.setStockQuantity(rs.getInt("quantity"));

			return menuOrder;

		});
	}

}