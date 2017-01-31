package com.restaurant.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.restaurant.model.*;
import com.restaurant.util.*;

public class MenuDAO {

	private final JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();

	public void save(Menu menu) {
		String sql = "insert into menu(id,food_list) values(?,?)";
		Object[] params = { menu.getMenuId(), menu.getMenuList() };
		jdbcTemplate.update(sql, params);
		
	}

	public List<Menu> list() {
		String sql = "SELECT id,food_list FROM menu order by id";
		return jdbcTemplate.query(sql, (rs, rowNum) -> {
			return convert(rs);

		});

	}

	public Menu convert(ResultSet rs) throws SQLException {
		Menu menu = new Menu();
		menu.setMenuId(rs.getInt("id"));
		menu.setMenuList(rs.getString("food_list"));
		return menu;
	}

	public Menu listByItem(String item) {
		String sql = "select id,food_list FROM menu WHERE food_list=?";
		Object[] params = { item };

		return jdbcTemplate.queryForObject(sql, params, (rs, rowNum) -> {
			Menu menu = new Menu();
			menu.setMenuId(rs.getInt("id"));
			menu.setMenuList(rs.getString("food_list"));
			return menu;

		});
	}

}
