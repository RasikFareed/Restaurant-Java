package com.restaurant.testDAO;

import com.restaurant.MenuOrder;
import com.restaurant.DAO.MenuOrderDAO;

public class TestMenuOrderDAO {

	public static void main(String[] args) {
		MenuOrder menuOrder = new MenuOrder();
		MenuOrderDAO menuOrderDao = new MenuOrderDAO();
		menuOrder = menuOrderDao.listByQuantity(1);
		System.out.println(menuOrder.getMenuOrderId() + "\t" + menuOrder.getMenuListId().getMenuId() + "\t"
				+ menuOrder.getFoodTypeId().getFoodTypeId() + "\t" + menuOrder.getStockQuantity());

	}

}