package com.restaurant.DAO;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import com.restaurant.util.*;
import com.restaurant.*;
public class MenuOrderDAO {
	
	private final JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();
	
	
/*	public void save(MenuOrder menuOrder){
		String sql="insert into menuorder(id,menu_list,food_type,quantity) values(?,?,?,?)";
		Object[] params = {menuOrder.getMenuOrderId(),menuOrder.getMenuListId(),menuOrder.getFoodTypeId(),menuOrder.getStockQuantity()};
		int rows = jdbcTemplate.update(sql, params);
		System.out.println("No of rows inserted: " + rows);
	}*/
	
public List<MenuOrder> list(){
		
		String sql="select id,menu_list,food_type,quantity FROM menuorder";
		return jdbcTemplate.query(sql,(rs,rowNum)->
		{
			MenuOrder menuOrder=new MenuOrder();
			menuOrder.setMenuOrderId(rs.getInt("id"));
			
		
			Menu menus=new Menu();
			menus.setMenuId(rs.getInt("id"));
			menuOrder.setMenuListId(menus);
			
			FoodType foodTypes=new FoodType();
			foodTypes.setFoodTypeId(rs.getInt("id"));
			menuOrder.setFoodTypeId(foodTypes);
			
			menuOrder.setStockQuantity(rs.getInt("quantity"));
			
			
			return menuOrder;

		});
	}
	
	public MenuOrder listByQuantity(int id){
		String sql="select id,menu_list,food_type,quantity FROM menuorder WHERE id=?";
		Object[] params={ id };

		
		return jdbcTemplate.queryForObject(sql,params,(rs,rowNum)->
		{
			MenuOrder menuOrder=new MenuOrder();
			menuOrder.setMenuOrderId(rs.getInt("id"));
			
			Menu menus=new Menu();
			menus.setMenuId(rs.getInt("id"));
			menuOrder.setMenuListId(menus);
			
			FoodType foodTypes=new FoodType();
			foodTypes.setFoodTypeId(rs.getInt("id"));
			menuOrder.setFoodTypeId(foodTypes);
			
			menuOrder.setStockQuantity(rs.getInt("quantity"));
			
			return menuOrder;
			
		});
	}
}