package com.restaurant.testDAO;

import java.util.List;

import com.restaurant.*;
import com.restaurant.DAO.*;

public class TestMenuDAO {

	public static void main(final String[] args) {

		Menu menu = new Menu();
		MenuDAO menuDAO = new MenuDAO();
		List<Menu> list = menuDAO.list();
		for (Menu s : list) {
			System.out.println(s);
		}

		menu = menuDAO.listByItem("Idly");
		System.out.println(menu.getMenuId() + "\t" + menu.getMenuList());

	}

}
