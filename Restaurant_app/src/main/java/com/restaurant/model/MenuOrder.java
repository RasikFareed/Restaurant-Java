package com.restaurant.model;

import lombok.*;

@Data
public class MenuOrder {
	private int menuOrderId;
	private Menu menuListId;
	private FoodType foodTypeId;
	private int stockQuantity;
}
