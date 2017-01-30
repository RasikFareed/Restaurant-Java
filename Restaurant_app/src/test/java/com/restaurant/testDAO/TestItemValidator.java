package com.restaurant.testDAO;

import com.restaurant.Menu;
import com.restaurant.validator.ItemValidator;

public class TestItemValidator {

	public static void main(String[] args) {
		

		Menu menu = new Menu();
		menu.setMenuList("");
		ItemValidator itemValidator = new ItemValidator();
		itemValidator.listByItem(menu);
		
	}

}
