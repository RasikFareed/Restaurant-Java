package com.restaurant.testdao;

import com.restaurant.dao.MenuOrderDAO;
import com.restaurant.model.MenuOrder;

public class TestMenuOrderDAO {

	public static void main(String[] args) {
		MenuOrder menuOrder = new MenuOrder();
		MenuOrderDAO menuOrderDao = new MenuOrderDAO();
		menuOrder = menuOrderDao.listByQuantity(11);
		System.out.println(menuOrder.getMenuOrderId() + "\t" + menuOrder.getMenuListId().getMenuId() + "\t"
				+ menuOrder.getFoodTypeId().getFoodTypeId() + "\t" + menuOrder.getStockQuantity());

	}

}