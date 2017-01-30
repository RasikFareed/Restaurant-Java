package com.restaurant.validator;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.restaurant.Menu;
import com.restaurant.exception.ItemNotFoundException;

public class ItemValidator {
	private static final Logger logger = Logger.getLogger(ItemValidator.class.getName());

	public void listByItem(Menu menu) {

		if ("".equals(menu.getMenuList()) || " ".equals(menu.getMenuList())) {
			try {

				throw new ItemNotFoundException("Item not in menu list");
			} catch (ItemNotFoundException e) {

				logger.log(Level.SEVERE, "Exceptions Occured", e);
			}

		}
	}
}
