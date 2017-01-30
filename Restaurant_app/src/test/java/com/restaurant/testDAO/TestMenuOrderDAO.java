package com.restaurant.testDAO;

import java.util.Iterator;
import java.util.List;

import com.restaurant.*;
import com.restaurant.DAO.*;

public class TestMenuOrderDAO {

	public static void main(String[] args) {

		MenuOrderDAO menuOrderDao = new MenuOrderDAO();
		List<MenuOrder> list = menuOrderDao.list();
		Iterator<MenuOrder> i = list.iterator();
		while (i.hasNext()) {
			MenuOrder menuorder = (MenuOrder) i.next();
			System.out.println(menuorder.getMenuOrderId() + "\t" + menuorder.getMenuListId().getMenuId() + "\t"
					+ menuorder.getFoodTypeId().getFoodTypeId() + "\t" + menuorder.getStockQuantity());
		}
	}

}
