package com.restaurant.validator;

import com.restaurant.Menu;
import com.restaurant.exception.ItemNotFoundException;

public class ItemValidator {

	
public void listByItem(Menu menu) {

		if ("".equals(menu.getMenuList())|| " ".equals(menu.getMenuList())) {
			try {
				
				throw new ItemNotFoundException("Item not in menu list");
			} 
			catch (ItemNotFoundException e) {
				System.out.println("Item not in menu list");
			}

		}
	}
}
